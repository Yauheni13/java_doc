import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by lenovo on 05.01.2017.
 */
public class ClickOnCarrerBox {
    WebDriver wd;
    @Test
    public void clickOnCarrerBox(){
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.get("http://premierinc.com");
        wd.findElement(By.cssSelector("a[title=Careers")).click();
        wd.findElement(By.cssSelector(".alignnone.wp-image-9557.size-full")).click();
    }

}
