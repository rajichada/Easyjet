package Selenium.Training.stepdefinitions;

import Selenium.Training.basePage;
import Selenium.Training.openclosedriver;
import Selenium.Training.pages.register_easyjet_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertEquals;


public class register_easyjet_sd extends basePage {
    openclosedriver OPD = new openclosedriver();

    // creating a link between register_easyjet_sd and register_easyjet_page
    public register_easyjet_page SP = PageFactory.initElements(OPD.driver, register_easyjet_page.class);

    @Given("^I enter url \"([^\"]*)\"$")
    public void iEnterUrl(String url) throws Throwable {

        //  OPD.driver.get(url);

        openUrl(OPD.URL + url);
    }

    @Given("^I enter MyEmailAddressIs \"([^\"]*)\"$")
    public void iEnterMyEmailAddressIs(String EmailAddress) throws Throwable {
        //  OPD.driver.findElement(By.id("EmailAddress")).sendKeys(EmailAddress);
        SP.emailAddress(EmailAddress);
    }

    @Given("^I enter Confirm your email address \"([^\"]*)\"$")
    public void iEnterConfirmYourEmailAddress(String ConfirmEmailAddress) throws Throwable {
        //  OPD.driver.findElement(By.id("EmailAddressCheck")).sendKeys(ConfirmEmailAddress);
        SP.confirmEmailId(ConfirmEmailAddress);
    }


    @Then("^I should see the Errormessage \"([^\"]*)\"$")
    public void iShouldSeeTheErrormessage(String expectedMessage) throws Throwable {

        SP.seeErrorMessage(expectedMessage);
        //Finding an element using Xpath

        // String actualResult = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        // assertEquals(expectedMessage, actualResult);
    }

    @Given("^I enter Your password \"([^\"]*)\"$")
    public void iEnterYourPassword(String password) throws Throwable {
        OPD.driver.findElement(By.id("Password")).sendKeys(password);
    }

    @Given("^I enter Confirm your password \"([^\"]*)\"$")
    public void iEnterConfirmYourPassword(String confirmPassword) throws Throwable {
        OPD.driver.findElement(By.id("PasswordCheck")).sendKeys(confirmPassword);
    }

    @Given("^I enter Title \"([^\"]*)\"$")
    public void iEnterTitle(String title) throws Throwable {
        OPD.driver.findElement(By.id("TitleTypeCode")).sendKeys(title);
    }

    @Given("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) throws Throwable {
        OPD.driver.findElement(By.id("FirstName")).sendKeys(firstName);
    }

    @Given("^I enter Surname \"([^\"]*)\"$")
    public void iEnterSurname(String surname) throws Throwable {
        OPD.driver.findElement(By.id("LastName")).sendKeys(surname);
    }


    @Given("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String address1) throws Throwable {
        OPD.driver.findElement(By.id("Address1")).sendKeys(address1);
    }

    @Given("^I enter Town \"([^\"]*)\"$")
    public void iEnterTown(String town) throws Throwable {
        OPD.driver.findElement(By.id("City")).sendKeys(town);
    }


    @Given("^I enter Postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postcode) throws Throwable {
        OPD.driver.findElement(By.id("PostalCode")).sendKeys(postcode);
    }

    @Given("^I enter the Phone number \"([^\"]*)\"$")
    public void iEnterThePhoneNumber(String phoneNumber) throws Throwable {
        OPD.driver.findElement(By.id("MobilePhone")).sendKeys(phoneNumber);
    }

    @When("^I click on Register$")
    public void iClickOnRegister() throws Throwable {
        OPD.driver.findElement(By.name("btn-submit")).click();
    }

    @When("^I click on Login$")
    public void iClickOnLogin() throws Throwable {
        OPD.driver.findElement(By.linkText("Sign in")).click();

    }

    @Given("^I enter Email Address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String emailAddress) throws Throwable {
        OPD.driver.findElement(By.id("register_easyjet_sd-username")).sendKeys(emailAddress);
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        OPD.driver.findElement(By.id("register_easyjet_sd-password")).sendKeys(password);
    }

    @When("^I click on Signin$")
    public void iClickOnSignin() throws Throwable {
        OPD.driver.findElement(By.id("register_easyjet_sd-login")).click();
    }

    @Then("^I should see Error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String Errormessage_expected) throws Throwable {
        String actualErrorMessage;
        actualErrorMessage = OPD.driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[3]/div[3]/div/ul/li")).getText();
        assertEquals(Errormessage_expected, actualErrorMessage);

    }

    @And("^I enter Country as \"([^\"]*)\"$")
    public void iEnterCountryAs(String countrycode) throws Throwable {
        // for dropdown menu
        new Select(OPD.driver.findElement(By.id("Country"))).selectByValue(countrycode);
    }
}
