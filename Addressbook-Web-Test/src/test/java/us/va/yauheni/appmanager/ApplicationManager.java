package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.model.NewContactForm;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void logOut() {
        wd.findElement(By.linkText("Logout")).click();
    }

    public void returnToGroupPage() {
        wd.findElement(By.linkText("CreateNewGroup page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getNamegroup());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void goToGroupPage() throws InterruptedException {
        boolean boo = true;
        wd.findElement(By.cssSelector(".admin>a")).click();
        while (boo) {
            try {
                wd.findElement(By.cssSelector("#content>h1"));
                boo = false;
            } catch (Exception ex) {
                Thread.sleep(1000);
                wd.findElement(By.cssSelector(".admin>a")).click();
            }

        }

    }

    public void stop() {
        logOut();
        wd.quit();
    }

    public void goToHomePage() {
        wd.findElement(By.linkText("home")).click();
    }

    public void confirmCreateNewContact() {
        wd.findElement(By.cssSelector("input[name=submit")).click();
    }

    public void fillNewContactForm(NewContactForm newContactForm) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(newContactForm.getFirstname());
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(newContactForm.getMiddlename());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(newContactForm.getLastname());
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(newContactForm.getNickname());
        wd.findElement(By.name("title")).click();
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(newContactForm.getTitle());
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(newContactForm.getCompany());
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(newContactForm.getAddress());
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(newContactForm.getHomephone());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(newContactForm.getMobilephone());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(newContactForm.getEmail());
        Select selectBirthDay = new Select(wd.findElement(By.cssSelector("select[name=bday]")));
        selectBirthDay.selectByVisibleText(newContactForm.getBirthDay());
        Select selectBirthMonth = new Select(wd.findElement(By.cssSelector("select[name=bmonth]")));
        selectBirthMonth.selectByVisibleText(newContactForm.getBirthMonth());
        Select selectGroup = new Select(wd.findElement(By.cssSelector("select[name=new_group]")));
        selectGroup.selectByIndex(1);
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(newContactForm.getBirthdayyear());
        wd.findElement(By.name("address2")).click();
        wd.findElement(By.name("address2")).clear();
        wd.findElement(By.name("address2")).sendKeys(newContactForm.getSecondaddress());
    }

    public void goToNewContactPage() {
        boolean boo = true;
        wd.findElement(By.linkText("add new")).click();
        while (boo) {
            try {
                wd.findElement(By.cssSelector("input[value=Delete]"));
                Thread.sleep(1000);
                wd.findElement(By.linkText("add new")).click();
            } catch (Exception ex) {
                boo = false;
            }

        }
    }
}
