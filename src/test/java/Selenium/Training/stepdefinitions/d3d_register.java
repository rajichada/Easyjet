package Selenium.Training.stepdefinitions;

import Selenium.Training.openclosedriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;

public class d3d_register extends openclosedriver {
    @Given("^I enter firstname as \"([^\"]*)\"$")
    public void iEnterFirstnameAs(String firstname) throws Throwable {
        driver.findElement(By.name("first_name")).sendKeys(firstname);
    }

    @And("^I enter lastname as \"([^\"]*)\"$")
    public void iEnterLastnameAs(String lastname) throws Throwable {
        driver.findElement(By.name("last_name")).sendKeys(lastname);
    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String emailAddress) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(emailAddress);
    }

    @And("^I enter new password as \"([^\"]*)\"$")
    public void iEnterNewPasswordAs(String newPassword) throws Throwable {
        driver.findElement(By.name("pass1")).sendKeys(newPassword);
    }

    @And("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String confirmPassword) throws Throwable {
        driver.findElement(By.name("pass2")).sendKeys(confirmPassword);
    }




    @When("^I click on Register button on Homepage$")
    public void iClickOnRegisterButtonOnHomepage() throws Throwable {
        driver.findElement(By.linkText("Register")).click();
    }
}
