package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import us.va.yauheni.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
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

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void initGroupModification() {
        click(By.cssSelector("input[name=edit]"));
    }

    public void confirmGroupModification() {
        click(By.cssSelector("input[name=update]"));
    }
}
