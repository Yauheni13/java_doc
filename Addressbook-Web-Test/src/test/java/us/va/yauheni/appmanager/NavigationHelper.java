package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() throws InterruptedException {
        boolean boo = true;
        click(By.cssSelector(".admin>a"));
        while (boo) {
            try {
                if(isElementPresent(By.name("new")) &&
                        isElementPresent(By.name("edit")) &&
                        isElementPresent(By.name("delete"))) {
                    boo = false;
                }
            } catch (Exception ex) {
                Thread.sleep(1000);
                click(By.cssSelector(".admin>a"));
            }

        }

    }

    private boolean isElementPresent(By locator) {
        if(wd.findElement(locator).isDisplayed()) {
            return true;
        }else return false;
    }

    public void goToHomePage() {
        click(By.linkText("home"));
    }

    public void goToNewContactPage() {
        boolean boo = true;
        click(By.linkText("add new"));
        while (boo) {
            try {
                wd.findElement(By.cssSelector("input[value=Delete]"));
                Thread.sleep(1000);
                click(By.linkText("add new"));
            } catch (Exception ex) {
                boo = false;
            }

        }
    }
}
