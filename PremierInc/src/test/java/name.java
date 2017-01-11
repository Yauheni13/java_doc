import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class name {
    FirefoxDriver wd;
    WebDriverWait wait;

    @Test
    public void testname() throws InterruptedException {
        wd = new FirefoxDriver();
        wait = new WebDriverWait(wd, 10/*seconds*/);
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("https://www.premierinc.com");
        wd.findElement(By.name("s")).click();
        wd.findElement(By.name("s")).clear();
        wd.findElement(By.name("s")).sendKeys("flu 2016");
        wd.findElement(By.cssSelector("button.btn.btn-default")).click();
        Thread.sleep(3000);
        boolean boo = true;
        int i=0;
        List<WebElement> news = wd.findElements(By.cssSelector(".entry-title>a"));
        while(boo) {
            int r = news.size();
            while (r != 10){
                news = wd.findElements(By.cssSelector(".entry-title>a"));
                r = news.size();
            }
            for (WebElement e : news) {
                    String str = e.getAttribute("innerText");
                    System.out.println(str);
                    if (str.equals("Top value-based care rule changes for 2016")) {
                        e.click();
                        Set<String> oldhandles = wd.getWindowHandles();
                        wd.findElement(By.cssSelector(".pf-content>p>a")).click();
                        Thread.sleep(5000);
                        Set<String> newhandles = wd.getWindowHandles();
                        newhandles.removeAll(oldhandles);
                        String newHandle = (String) newhandles.toArray()[0];
                        System.out.println(newhandles.size());
                        System.out.println(newHandle);
                        wd.switchTo().window(newHandle);
                        if(wd.getTitle().contains("404")){
                            System.out.println("error 404 - page not found");
                            wd.close();
                        };
                        wd.close();
                        boo = false;
                        break;
                    }
            }
            if (boo == true) {
                String key = wd.findElement(By.cssSelector(".active>span")).getText();
                WebElement pagination = wd.findElement(By.cssSelector(".pagination"));
                WebElement nextPost = pagination.findElement(By.cssSelector(".nextpostslink"));

//                Thread.sleep(5000);
                while (key.equals(wd.findElement(By.cssSelector(".active>span")).getText())) {
                    JavascriptExecutor js = (JavascriptExecutor) wd;
                    js.executeScript("arguments[0].click();", nextPost);
                    Thread.sleep(1000);
                }
            }
                news.clear();
//                wait.until(ExpectedConditions.stalenessOf(news.get(0)));
            if (i == 3) {boo = false;}
            else i++;
        }
        Thread.sleep(5000);
        wd.quit();
    }
}
