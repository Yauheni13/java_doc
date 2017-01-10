package us.va.yauheni.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import us.va.yauheni.model.GroupData;
import us.va.yauheni.utils.GenerateString;

import java.util.HashSet;
import java.util.List;

public class CreateNewGroup extends TestBase {

    @Test
    public void testGroupCreation() throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
            app.getNavigationHelper().goToGroupPage();
            List<GroupData> before = app.getGroupHelper().getGroupList();
            app.getGroupHelper().initGroupCreation();
            GroupData group = new GroupData(0,
                    GenerateString.generateString(GenerateString.randomint(2, 10)),
                    GenerateString.generateString(GenerateString.randomint(2, 10)),
                    GenerateString.generateString(GenerateString.randomint(2, 10)));
            app.getGroupHelper().fillGroupForm(group);
            app.getGroupHelper().submitGroupCreation();
            app.getNavigationHelper().goToGroupPage();
            List<GroupData> after = app.getGroupHelper().getGroupList();
            int ind = 0;
            for (int i=0; i<after.size(); i++){
                if(after.get(i).getId() > ind) ind = after.get(i).getId();
            }
            group.setId(ind);
            before.add(group);
            Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));
//        }
    }

}
