package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Career_Page {
    private WebDriver driver = null;
    private final By Software_Tester_button = By.cssSelector("body > div.ffb-id-navigation-header.wrapper.ff-boxed-wrapper > div.page-wrapper > section.ffb-id-3g6otu79.fg-section.fg-text-dark > div > div > div.ffb-id-4bu1rjvh.fg-col.col-xs-12.col-md-12.fg-text-dark > div > div.ffb-id-3i0ubj7l.fg-col.col-xs-12.col-sm-6.col-md-4.fg-text-dark > div > div > div > div");

    public Career_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void SoftwareTester_click(){
        driver.findElement(Software_Tester_button).click();
        Reporter.log("Roles clicked",true);
    }
}
