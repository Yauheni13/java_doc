package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void goToGroupPage() throws InterruptedException {
        boolean boo = true;
        click(By.cssSelector(".admin>a"));
        while (boo) {
            try {
                wd.findElement(By.xpath("//*[@id='content']/form/span[1]/input"));
                boo = false;
            } catch (Exception ex) {
                Thread.sleep(1000);
                click(By.cssSelector(".admin>a"));
            }

        }

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
