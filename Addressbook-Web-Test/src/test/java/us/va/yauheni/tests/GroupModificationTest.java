package us.va.yauheni.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.utils.GenerateString;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        int number = GenerateString.randomint(0, before.size()-1);
        app.getGroupHelper().selectGroup(number);
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData(0, GenerateString.generateString(8),
                GenerateString.generateString(8),
                GenerateString.generateString(8));
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().confirmGroupModification();
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        before.remove(number);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
