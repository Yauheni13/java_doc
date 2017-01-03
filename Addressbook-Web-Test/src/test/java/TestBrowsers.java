

import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class TestBrowsers {
        WebDriver wd;

        @Test
        public void test() throws InterruptedException {

//            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", Arrays.asList("ignore-certificate-errors"));
//        options.addArguments("enable-devtools-experiments");
//        caps.setCapability(un);
//        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-devtools-experiments"));

//            caps.setCapability("unexpectedAlertBehaviour", "dismiss");
//        wd = new ChromeDriver(caps);
            wd = new InternetExplorerDriver();
            System.out.println(((HasCapabilities) wd).getCapabilities());
            wd.get("http://google.com");
            wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            wd.findElement(By.name("q")).sendKeys("cheese");
            wd.findElement(By.name("btnG")).click();
            Thread.sleep(2000);
            wd.quit();
        }
    }
