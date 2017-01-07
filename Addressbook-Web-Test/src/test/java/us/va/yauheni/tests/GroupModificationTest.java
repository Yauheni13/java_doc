package us.va.yauheni.tests;

import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.utils.GenerateString;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData(GenerateString.generateString(8),
                GenerateString.generateString(8),
                GenerateString.generateString(8)));
        app.getGroupHelper().confirmGroupModification();
        app.getNavigationHelper().goToHomePage();
    }
}
