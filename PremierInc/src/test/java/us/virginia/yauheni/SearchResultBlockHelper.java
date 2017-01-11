package us.virginia.yauheni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class SearchResultBlockHelper extends HelperBase{

    public SearchResultBlockHelper(WebDriver wd) {
        super(wd);
    }

    protected void findParticularNews(String newsTitle) throws InterruptedException {
        boolean boo = true;
        List<WebElement> news = wd.findElements(By.cssSelector(".entry-title>a"));
        while(boo) {
            while (news.size() != 10){
                news = wd.findElements(By.cssSelector(".entry-title>a"));
            }
            for (WebElement e : news) {
                if (e.getAttribute("innerText").equals(newsTitle)) {
                    e.click();
                    Set<String> oldhandles = wd.getWindowHandles();
                    wd.findElement(By.cssSelector(".pf-content>p>a")).click();
                    Thread.sleep(5000);
                    Set<String> newhandles = wd.getWindowHandles();
                    newhandles.removeAll(oldhandles);
                    String newHandle = (String) newhandles.toArray()[0];
                    wd.switchTo().window(newHandle);
                    if(wd.getTitle().contains("404")){
                        System.out.println("error 404 - page not found");
                        wd.close();
                    }
                    wd.close();
                    boo = false;
                    break;
                }
            }
            if (boo == true) {
                String key = wd.findElement(By.cssSelector(".active>span")).getText();
                WebElement pagination = wd.findElement(By.cssSelector(".pagination"));
                WebElement nextPost = pagination.findElement(By.cssSelector(".nextpostslink"));
                while (key.equals(wd.findElement(By.cssSelector(".active>span")).getText())) {
                    clickOn(nextPost);
                    Thread.sleep(500);
                }
                news.clear();
            }
        }
    }

}
