package us.virginia.yauheni;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void fillInputField(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    protected void selectByVisibleText(By locator, String value) {
        Select selectState = new Select(wd.findElement(locator));
        selectState.selectByVisibleText(value);
    }
    protected void checkBoxOn(By locator) {
        if (!wd.findElement(locator).isSelected()) {
            wd.findElement(locator).click();}
    }


    protected void clickOn(WebElement nextPost) {
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("arguments[0].click();", nextPost);
    }
}
