package Selenium.Training;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class openclosedriver {
    //  we use static in only the below instance
    public static WebDriver driver;
    public static String URL;

    public void openBrowser() throws IOException {

        readPropertiesFiles();


        String browser1;
        browser1 = System.getProperty("browser");


        if (browser1.equalsIgnoreCase("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else {


            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }


        driver.manage().window().fullscreen();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void readPropertiesFiles() throws IOException {
        String env;
        env = System.getProperty("Environ");

        File file;

        String usrdir = System.getProperty("user.dir");

        file = new File(usrdir + "/src/test/java/Selenium/Training/PropertyFiles");


        if (env.equalsIgnoreCase("qa")) {

            file = new File(file + "/qa.properties");

        } else {
            file = new File(file + "/live.properties");
        }

        FileInputStream fileinput = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileinput);

        URL = prop.getProperty("url");
    }
}
