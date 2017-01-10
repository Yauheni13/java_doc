package us.va.yauheni.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.utils.GenerateString;

import java.util.List;

public class DeleteGroup extends TestBase{

    @Test
    public void deleteGroup() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        int number = GenerateString.randomint(0, before.size() - 1);
        app.getGroupHelper().deleteGroup(number);
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(before.size() - 1, after.size());
        before.remove(number);
        Assert.assertEquals(before, after);

    }
}
