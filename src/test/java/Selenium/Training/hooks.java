package Selenium.Training;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

// Hooks class is meant for the following lines
public class hooks {
    openclosedriver OCD =new openclosedriver();
    @Before
    public void open_browser() throws IOException {

      OCD.openBrowser();
    }
    @After
    public void close_browser(){

       OCD.closeBrowser();
    }
}
