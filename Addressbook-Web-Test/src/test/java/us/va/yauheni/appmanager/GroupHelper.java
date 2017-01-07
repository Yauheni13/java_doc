package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.utils.GenerateString;

import java.util.List;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void selectGroup() { click(By.xpath("//*[@id='content']/form/span[1]/input"));}

    public void fillGroupForm(GroupData groupData) {
        fillTheField(By.name("group_name"), groupData.getNamegroup());
        fillTheField(By.name("group_header"), groupData.getHeader());
        fillTheField(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() throws InterruptedException {
        for (int i=0; i<10; i++){
            click(By.name("new"));
            if(wd.findElement(By.cssSelector("input[name=group_name]")).isDisplayed()) break;
            Thread.sleep(200);
        }
    }

    public void initGroupModification() {
        click(By.cssSelector("input[name=edit]"));
    }

    public void confirmGroupModification() {
        click(By.cssSelector("input[name=update]"));
    }

    public void deleteGroup(String group) {
        List<WebElement> groups = wd.findElements(By.cssSelector("span.group"));
        boolean boo = true;
        if (groups.size() > 0) {
            for (WebElement we : groups) {
                if (we.getText().equals(group) && !we.isSelected()) {
                    we.click();
                    confirmGroupDeletion();
                    boo = false;
                    break;
                }
            }
        }else System.out.println("There are no any groups");
        if (boo) System.out.println(("There is not such group"));
    }
    public void deleteGroup(Integer index) {
        List<WebElement> groups = wd.findElements(By.cssSelector("span.group"));
        if (groups.size() > 0) {
            if(!(index > groups.size())){
                groups.get(index).click();
                confirmGroupDeletion();
            } else System.out.println(("There is not such group"));
        } else System.out.println("There are no any groups");
    }

    public void deleteGroup() {
        List<WebElement> groups = wd.findElements(By.cssSelector("span.group"));
        if (groups.size() > 0) {
            groups.get(GenerateString.randomint(0, groups.size()-1)).click();
            confirmGroupDeletion();
        } else System.out.println("There are no any groups");
    }



    private void confirmGroupDeletion() {
        wd.findElement(By.cssSelector("input[name=delete]")).click();
    }
}
