package us.va.yauheni.tests;

import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() throws InterruptedException {
        App.getNavigationHelper().goToGroupPage();
        App.getGroupHelper().selectGroup();
        App.getGroupHelper().initGroupModification();
        App.getGroupHelper().fillGroupForm(new GroupData("name", "header", "footer"));
        App.getGroupHelper().confirmGroupModification();
        App.getNavigationHelper().goToHomePage();
    }
}
