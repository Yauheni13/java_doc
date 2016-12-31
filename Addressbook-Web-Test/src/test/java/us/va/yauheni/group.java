package us.va.yauheni;

import org.testng.annotations.Test;

public class group extends TestBase{

    @Test
    public void testGroupCreation() throws InterruptedException {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();

    }

}
