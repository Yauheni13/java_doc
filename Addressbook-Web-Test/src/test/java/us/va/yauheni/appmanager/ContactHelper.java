package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import us.va.yauheni.model.Contact;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmCreateNewContact() {
        click(By.cssSelector("input[name=submit"));
    }

    public void fillNewContactForm(Contact contact) {
        fillTheField(By.name("firstname"), contact.getFirstname());
        fillTheField(By.name("middlename"), contact.getMiddlename());
        fillTheField(By.name("lastname"), contact.getLastname());
        fillTheField(By.name("nickname"), contact.getNickname());
        fillTheField(By.name("title"), contact.getTitle());
        fillTheField(By.name("company"), contact.getCompany());
        fillTheField(By.name("home"), contact.getHomephone());
        fillTheField(By.name("mobile"), contact.getMobilephone());
        fillTheField(By.name("email"), contact.getEmail());
        Select selectBirthDay = new Select(wd.findElement(By.cssSelector("select[name=bday]")));
        selectBirthDay.selectByVisibleText(contact.getBirthDay());
        Select selectBirthMonth = new Select(wd.findElement(By.cssSelector("select[name=bmonth]")));
        selectBirthMonth.selectByVisibleText(contact.getBirthMonth());
        Select selectGroup = new Select(wd.findElement(By.cssSelector("select[name=new_group]")));
        selectGroup.selectByVisibleText(contact.getGroup());
        fillTheField(By.name("byear"), contact.getBirthdayyear());
        fillTheField(By.name("address2"), contact.getSecondaddress());
    }
}
