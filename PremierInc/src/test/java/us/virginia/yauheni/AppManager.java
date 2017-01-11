package us.virginia.yauheni;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AppManager {

    WebDriver wd;
    String browser;
    private HeaderHelper headerHelper;
    private SearchResultBlockHelper searchResultBlockHelper;

    public AppManager(String browser) {
        this.browser = browser;
    }

    protected void init() {
        if (Objects.equals(browser, BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (Objects.equals(browser, BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if (Objects.equals(browser, BrowserType.IE)) {
            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability("unexpectedAlertBehaviour", "dismiss");
            wd = new InternetExplorerDriver(caps);
        }
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        headerHelper = new HeaderHelper(wd);
        searchResultBlockHelper = new SearchResultBlockHelper(wd);


    }

    protected void stop() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


    protected void clickOnFullStoryButton() {
        wd.findElement(By.linkText("Full story")).click();
    }

    protected void goToHomePage() {
        wd.get("http://www.premierinc.com");
    }

    public HeaderHelper getHeaderHelper() {
        return headerHelper;
    }
    public SearchResultBlockHelper getSearchResultBlockHelper() {
        return searchResultBlockHelper;
    }

}
