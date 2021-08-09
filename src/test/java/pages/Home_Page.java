package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;

public class Home_Page {

    private WebDriver driver = null;
    private Actions actions = null;
    private final By AcceptCookie_button = By.xpath("//*[@id=\"branda-cookie-notice\"]/div/div/span[2]/a");
    private final By Home_button = By.cssSelector(".navbar-logo-img-normal");
    private final By AboutUS_button = By.xpath("//*[@id=\"menu-item-28331\"]/a");
    private final By Service_button = By.id("menu-item-28332");
    private final By Service_DesktopSolution_button = By.id("menu-item-28399");
    private final By Product_button = By.id("menu-item-92992");
    private final By Product_MiningSolution_button = By.id("menu-item-28341");
    private final By Blog_button = By.id("menu-item-28334");
    private final By Blog_NewsUpdate_button = By.id("menu-item-32339");
    private final By Career_button = By.id("menu-item-30191");
    private final By Contact_button = By.id("menu-item-28336");
    private final By Language_button = By.cssSelector(".ffb-id-3gr3e32h > #icl_lang_sel_widget-2 .js-wpml-ls-item-toggle");
    private final By Language_Indonesia_button = By.cssSelector(".ffb-id-3gr3e32h > #icl_lang_sel_widget-2 .icl-id > .wpml-ls-link");
    private final By Assert_Element = By.xpath("//*[@id=\"home\"]/div/div/div/div/div/div[1]/div/div");

    public Home_Page(WebDriver driver, Actions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public void Service_DesktopSolution_click(){
        actions.moveToElement(driver.findElement(Service_button)).moveToElement(driver.findElement(Service_DesktopSolution_button)).click().build().perform();
        Reporter.log("Desktop Solution button clicked", true);
    }

    public void Product_MiningSolution_click(){
        actions.moveToElement(driver.findElement(Product_button)).moveToElement(driver.findElement(Product_MiningSolution_button)).click().build().perform();
        Reporter.log("Product button clicked", true);
    }

    public void Blog_NewsUpdate_click(){
        actions.moveToElement(driver.findElement(Blog_button)).moveToElement(driver.findElement(Blog_NewsUpdate_button)).click().build().perform();
        Reporter.log("News Update button clicked", true);
    }

    public void Home_click() {
        driver.findElement(Home_button).click();
        Reporter.log("Home button clicked", true);
    }

    public void AcceptCookies_click() {
        driver.findElement(AcceptCookie_button).click();
        Reporter.log("Accept Cookies button clicked", true);
    }

    public void AboutUS_click() {
        driver.findElement(AboutUS_button).click();
        Reporter.log("About US button clicked", true);
    }

    public void Service_click() {
        driver.findElement(Service_button).click();
        Reporter.log("Service button clicked", true);
    }

    public void Product_click() {
        driver.findElement(Product_button).click();
        Reporter.log("Product button clicked", true);
    }

    public void Blog_click() {
        driver.findElement(Blog_button).click();
        Reporter.log("Blog button clicked", true);
    }

    public void Career_click() {
        driver.findElement(Career_button).click();
        Reporter.log("Career button clicked", true);
    }

    public void Contact_click() {
        driver.findElement(Contact_button).click();
        Reporter.log("Contact button clicked", true);
    }

    public void Language_click() {
        driver.findElement(Language_button).click();
        Reporter.log("Language button clicked", true);
    }

    public void Language_Indonesia_click() {
        driver.findElement(Language_Indonesia_button).click();
        Reporter.log("Choose Indonesia", true);
    }

    public void waitAssertionAppear(){
        new WebDriverWait(driver,30,30).until(ExpectedConditions.presenceOfElementLocated(Assert_Element));
        //new WebDriverWait(driver, DurationUtils.toMillisInt(Duration.ofMillis(20000))).until(ExpectedConditions.presenceOfElementLocated(Assert_Element));
    }

    public String Assert_get() {
        return driver.findElement(Assert_Element).getText();
    }
}
