package us.va.yauheni.tests;

import org.testng.annotations.Test;
import us.va.yauheni.model.Contact;

public class CreateNewContact extends TestBase {

    @Test
    public void newContact () {
        app.getNavigationHelper().goToNewContactPage();
        app.getContactHelper().fillNewContactForm(new Contact("First",
                "Middle",
                "Last",
                "Nick",
                "friend",
                "company",
                "Address",
                "+12028900099",
                "13450033990",
                "first.lastmiddle@company.net",
                "23",
                "May",
                "text1",
                "1978",
                "secondary",
                "notes"));
        app.getContactHelper().confirmCreateNewContact();
        app.getNavigationHelper().goToHomePage();
    }


}
