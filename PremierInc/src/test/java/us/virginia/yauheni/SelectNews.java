package us.virginia.yauheni;

import org.testng.annotations.Test;

public class SelectNews extends  TestBase{

    @Test
    public void selectParticularNews() throws InterruptedException {
        app.goToHomePage();
        app.getHeaderHelper().fillSearchFieldInHeader("flu 2016");
        app.getHeaderHelper().clickOnSearchFieldInHeader();
        app.getSearchResultBlockHelper().findParticularNews("Top value-based care rule changes for 2016");
    }
}
