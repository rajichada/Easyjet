package Selenium.Training;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",tags = {"@registration"},plugin = {"json:target/cucumber.json"})
public class runcucumber {

    //do not write anything in the class
}
