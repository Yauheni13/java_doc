package us.va.yauheni.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import us.va.yauheni.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager App = new ApplicationManager(BrowserType.IE);

    @BeforeMethod
    public void setUp() throws Exception {
        App.init();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        App.stop();
    }

}