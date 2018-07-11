package Selenium.Training;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage extends openclosedriver {
    WebDriverWait wait = new WebDriverWait(driver, 60);

    public void openUrl(String url) {

        driver.get(url);
    }

    public void waitForElement(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
