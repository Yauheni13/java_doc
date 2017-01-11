package us.virginia.yauheni;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RequestMoreInfo extends TestBase{


    @Test
    public void RequestMoreInfo() throws InterruptedException {
        app.goToHomePage();
        app.getHeaderHelper().requestMoreInformationButton();
        app.getHeaderHelper().fiiRequestMoreInfoForm(
                new RequestFormData("First Name",
                        "Last Name",
                        "",
                        "Email@Organization.com",
                        "(202) 555-6699",
                        "Washington",
                        "District of Columbia",
                        "22300",
                        "Q and C"));
        app.getHeaderHelper().submitMoreInformForm();
        assert app.wd.findElement(By.xpath("//*[@id='field_1_3']/div[2]")).isDisplayed();
        Thread.sleep(10000);
}
}
