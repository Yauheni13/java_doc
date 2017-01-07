package us.va.yauheni.tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase{

    @Test
    public void deleteGroup() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().deleteGroup();

    }
}
