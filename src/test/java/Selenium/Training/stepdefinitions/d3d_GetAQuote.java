package Selenium.Training.stepdefinitions;

import Selenium.Training.openclosedriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
// please extend the class from openclosedriver and not from other classes to use "driver" variable.
public class d3d_GetAQuote extends openclosedriver {
    @Given("^I enter the firstname as \"([^\"]*)\"$")
    public void iEnterTheFirstnameAs(String Firstname) throws Throwable {
     driver.findElement(By.id("first-name")).sendKeys(Firstname);
    }

    @And("^I enter the lastname as \"([^\"]*)\"$")
    public void iEnterTheLastnameAs(String lastname) throws Throwable {
      driver.findElement(By.id("last-name")).sendKeys(lastname);
    }

    @And("^I enter the Email as \"([^\"]*)\"$")
    public void iEnterTheEmailAs(String email) throws Throwable {
       driver.findElement(By.id("your-email")).sendKeys(email);
    }

    @And("^I enter the phone number as \"([^\"]*)\"$")
    public void iEnterThePhoneNumberAs(String phonenumber) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
    }

    @When("^I click on send message$")
    public void iClickOnSendMessage() throws Throwable {
      // driver.findElement(By.xpath(""))
    }
}
