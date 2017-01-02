package us.va.yauheni.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import us.va.yauheni.model.NewContactForm;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmCreateNewContact() {
        click(By.cssSelector("input[name=submit"));
    }

    public void fillNewContactForm(NewContactForm newContactForm) {
        fillTheField(By.name("firstname"), newContactForm.getFirstname());
        fillTheField(By.name("middlename"), newContactForm.getMiddlename());
        fillTheField(By.name("lastname"), newContactForm.getLastname());
        fillTheField(By.name("nickname"), newContactForm.getNickname());
        fillTheField(By.name("title"), newContactForm.getTitle());
        fillTheField(By.name("company"), newContactForm.getCompany());
        fillTheField(By.name("home"), newContactForm.getHomephone());
        fillTheField(By.name("mobile"), newContactForm.getMobilephone());
        fillTheField(By.name("email"), newContactForm.getEmail());
        Select selectBirthDay = new Select(wd.findElement(By.cssSelector("select[name=bday]")));
        selectBirthDay.selectByVisibleText(newContactForm.getBirthDay());
        Select selectBirthMonth = new Select(wd.findElement(By.cssSelector("select[name=bmonth]")));
        selectBirthMonth.selectByVisibleText(newContactForm.getBirthMonth());
        Select selectGroup = new Select(wd.findElement(By.cssSelector("select[name=new_group]")));
        selectGroup.selectByIndex(1);
        fillTheField(By.name("byear"), newContactForm.getBirthdayyear());
        fillTheField(By.name("address2"), newContactForm.getSecondaddress());
    }
}
