package us.va.yauheni.tests;

import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.utils.GenerateString;

public class CreateNewGroup extends TestBase {

    @Test
    public void testGroupCreation() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(
                new GroupData(GenerateString.generateString(GenerateString.randomint(2,10)),
                GenerateString.generateString(GenerateString.randomint(2,10)),
                GenerateString.generateString(GenerateString.randomint(2,10))));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().goToHomePage();

    }

}
