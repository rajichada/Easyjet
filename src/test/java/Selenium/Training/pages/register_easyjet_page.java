package Selenium.Training.pages;

import Selenium.Training.basePage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertEquals;

public class register_easyjet_page extends basePage {
    @FindBy(id = "EmailAddress")
    private WebElement EmailAddress;

    @FindBy(id = "EmailAddressCheck")
    private WebElement EmailId;

    @FindBy(id = "Password")
    private WebElement Password;

    @FindBy(id = "PasswordCheck")
    private WebElement confirmPassword;

    @FindBy(id = "TitleTypeCode")
    private WebElement Title;

    @FindBy(id = "FirstName")
    private WebElement firstname;

    @FindBy(id = "LastName")
    private WebElement lastname;

    @FindBy(id = "Address1")
    private WebElement adressline1;

    @FindBy(id = "Address2")
    private WebElement addressline2;

    @FindBy(id = "City")
    private WebElement cityNmae;

    @FindBy(id = "PostalCode")
    private WebElement postcode;

    @FindBy(id = "Country")
    private WebElement countryName;

    @FindBy(id = "CountryMobileCodes")
    private WebElement countryCodeMobile;

    @FindBy(id = "MobilePhone")
    private WebElement mobilePhoneNumber;

    @FindBy(linkText = "I don't have a mobile phone")
    private WebElement alternateNumber;

    @FindBy(id = "PreferredAirport1")
    private WebElement preferredairport1;

    @FindBy(id = "PreferredAirport2")
    private WebElement prefferedairport2;

    @FindBy(id = "PreferredAirport3")
    private WebElement prefferedairport3;

    @FindBy(id = "OptInForEasyJetMailings")
    private WebElement mailOptIn;

    @FindBy(id = "OptInForMailings")
    private WebElement mailsfrompartners;

    @FindBy(id = "btnRegister")
    private WebElement registerbutton_id;

    @FindBy(xpath = "//*[@id='btnRegister']/span")
    private WebElement registerButton_xpath;

    @FindBy(css = "#btnRegister>span")
    private WebElement registerButton_css;

    @FindBy(linkText = "Register now")
    private WebElement registerButton_linktext;


    @FindBy(xpath = ".//*[@id='post-4519']/div/div[1]/p")
    private WebElement ErrMsg;

    public void emailAddress(String Email) {

        // driver.findElement(By.id("EmailAddress")).sendKeys(EmailAddress);
        EmailAddress.sendKeys(Email);
    }

    public void confirmEmailId(String ConfirmEmail) {
        EmailId.sendKeys(ConfirmEmail);
    }

    public void yourPassword(String password) {
        Password.sendKeys(password);
    }

    public void confirmPassword(String ConfirmPassword) {   //WebElement.inputtype(content entered into the box as datatype)
        confirmPassword.sendKeys(ConfirmPassword);
    }

    public void TitleType(String yourTitle) {

        String titlevalue;

        if (yourTitle.equalsIgnoreCase("Mr")) {
            titlevalue = "1";
        } else if (yourTitle.equalsIgnoreCase("Mrs")) {

            titlevalue = "2";

        } else if (yourTitle.equalsIgnoreCase("Ms")) {
            titlevalue = "3";

        } else {

            titlevalue = "4";
        }
        new Select(Title).selectByValue(titlevalue);


    }

    public void yourFirstname(String firstName) {
        firstname.sendKeys(firstName);
    }

    public void seeErrorMessage(String errorMsg) {

        waitForElement(ErrMsg);

      //  Thread.sleep(2000); wait time is hard coded

        //Finding an element using Xpath
        String actualResult = ErrMsg.getText();
        assertEquals(errorMsg, actualResult);

    }
}
