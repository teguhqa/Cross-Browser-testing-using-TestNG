package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;

public class ApplicationSent_Page {
    private WebDriver driver = null;
    private final By ApplicationSent_label = By.cssSelector("body > section > div > div > div > div > div > div > div.ffb-id-3gmomh2c.post-content.ff-post-content-element.fg-text-dark > div > h1 > strong");

    public ApplicationSent_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void waitApplicationSent(){
        new WebDriverWait(driver, 30,30).until(ExpectedConditions.presenceOfElementLocated(ApplicationSent_label));
    }

    public String Assert_get(){
        return driver.findElement(ApplicationSent_label).getText();
    }



}
