package us.va.yauheni.tests;

import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;

public class CreateNewGroup extends TestBase {

    @Test
    public void testGroupCreation() throws InterruptedException {
        App.getNavigationHelper().goToGroupPage();
        App.getGroupHelper().initGroupCreation();
        App.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        App.getGroupHelper().submitGroupCreation();
        App.getNavigationHelper().returnToGroupPage();

    }

}
