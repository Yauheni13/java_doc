package us.virginia.yauheni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{

    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    protected void clickOnSearchFieldInHeader() {
        clickOn(wd.findElement(By.cssSelector("button.btn.btn-default")));
    }

    protected void requestMoreInformationButton() {
        clickOn(wd.findElement(By.xpath("//*[@id='menu-footer-supplier-partners-navigation']/li/ul/li[5]/a")));
    }

    protected void fillSearchFieldInHeader(String text) {
        fillInputField(By.name("s"), text);
    }

    protected void fiiRequestMoreInfoForm(RequestFormData requestFormData) {
        fillInputField(By.id("input_1_9"), requestFormData.getFirstName());
        fillInputField(By.id("input_1_10"), requestFormData.getLastName());
        fillInputField(By.id("input_1_3"), requestFormData.getOrganization());
        fillInputField(By.id("input_1_4"), requestFormData.getEmail());
        fillInputField(By.id("input_1_5"), requestFormData.getPhone());
        fillInputField(By.id("input_1_6"), requestFormData.getCity());
        selectByVisibleText(By.id("input_1_7"), requestFormData.getState());
        checkBoxOn(By.cssSelector("#choice_1_11_1"));
        checkBoxOn(By.cssSelector("#choice_1_11_3"));
        checkBoxOn(By.cssSelector("#choice_1_11_5"));
        fillInputField(By.id("input_1_8"), requestFormData.getZipCode());
        fillInputField(By.id("input_1_13"), requestFormData.getComments());
    }

    protected  void submitMoreInformForm(){
        wd.findElement(By.cssSelector("#gform_submit_button_1")).click();
    }

}
