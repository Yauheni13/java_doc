package us.va.yauheni.tests;

import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.tests.TestBase;

public class CreateNewGroup extends TestBase {

    @Test
    public void testGroupCreation() throws InterruptedException {
        App.goToGroupPage();
        App.initGroupCreation();
        App.fillGroupForm(new GroupData("test1", "test2", "test3"));
        App.submitGroupCreation();
        App.returnToGroupPage();

    }

}
