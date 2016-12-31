package us.va.yauheni;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class NewContact extends TestBase{

    @Test
    public void newContact () {
        goToNewContactPage();
        fillNewContactForm(new NewContactForm("First", "Middle", "Last", "Nick", "friend", "company", "Address", "+12028900099", "13450033990", "first.lastmiddle@company.net", "23", "May", "text1", "1978", "secondary"));
        confirmCreateNewContact();
        goToHomePage();
    }

    private void goToHomePage() {
        wd.findElement(By.linkText("home")).click();
    }

    private void confirmCreateNewContact() {
        wd.findElement(By.name("theform")).click();
    }

    private void fillNewContactForm(NewContactForm newContactForm) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(newContactForm.getFirstname());
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(newContactForm.getMiddlename());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(newContactForm.getLastname());
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(newContactForm.getNickname());
        wd.findElement(By.name("title")).click();
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(newContactForm.getTitle());
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(newContactForm.getCompany());
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(newContactForm.getAddress());
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(newContactForm.getHomephone());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(newContactForm.getMobilephone());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(newContactForm.getEmail());
        Select selectBirthDay = new Select(wd.findElement(By.cssSelector("select#bday")));
        selectBirthDay.selectByVisibleText(newContactForm.getBirthDay());
        Select selectBirthMonth = new Select(wd.findElement(By.cssSelector("select#bmonth")));
        selectBirthMonth.selectByVisibleText(newContactForm.getBirthMonth());
        Select selectGroup = new Select(wd.findElement(By.cssSelector("select#new_group")));
        selectGroup.selectByVisibleText(newContactForm.getGroup());
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(newContactForm.getBirthdayyear());
        wd.findElement(By.name("address2")).click();
        wd.findElement(By.name("address2")).clear();
        wd.findElement(By.name("address2")).sendKeys(newContactForm.getSecondaddress());
    }

    private void goToNewContactPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
