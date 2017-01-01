package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {

    protected FirefoxDriver wd;

    public HelperBase(FirefoxDriver wd) {
        this.wd=wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void fillTheField(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
