package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Dropdown_Handler {
    private WebDriver driver = null;
    private final By SocialNetwork_dropdown = By.cssSelector("#fld_8589119_1");
    private final By Instagram_choice = By.cssSelector("#fld_8589119_1 > option:nth-child(2)");
    private final By Twitter_choice = By.cssSelector("#fld_8589119_1 > option:nth-child(3)");
    private final By WhatsApp_choice = By.cssSelector("#fld_8589119_1 > option:nth-child(4)");
    private final By Telegram_choice = By.cssSelector("#fld_8589119_1 > option:nth-child(5)");
    private final By StackOverflow_choice = By.cssSelector("#fld_8589119_1 > option:nth-child(6)");

    public Dropdown_Handler(WebDriver driver) {
        this.driver = driver;
    }

    public void SocialNetwork_click(){
        driver.findElement(SocialNetwork_dropdown).click();
        Reporter.log("Social Network dropdown clicked");
    }

    public void Instagram_choose(){
        driver.findElement(Instagram_choice).click();
    }

    public void Twitter_choose(){
        driver.findElement(Twitter_choice).click();
    }

    public void WhatsApp_choose(){
        driver.findElement(WhatsApp_choice).click();
    }

    public void Telegram_choose(){
        driver.findElement(Telegram_choice).click();
    }

    public void StackOverflow_choose(){
        driver.findElement(StackOverflow_choice).click();
    }

}
