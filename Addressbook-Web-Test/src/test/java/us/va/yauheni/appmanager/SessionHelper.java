package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        fillTheField(By.name("user"), username);
        fillTheField(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

    public void logOut() throws InterruptedException {
        Thread.sleep(500);
        click(By.linkText("Logout")); }

}