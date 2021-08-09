package execution;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.*;

//---------------------------------------------------------------------------------------------------------------------
//-------------------------------------  Please use testng.xml to run the test  ---------------------------------------
//---------------------------------------------------------------------------------------------------------------------

public class Test {
    private String projectPath = System.getProperty("user.dir");
    private String cvPath = projectPath+"/src/test/resources/cv.pdf";

    ChromeOptions chromeOptions = null;
    WebDriver driver = null;

    Home_Page homePage = null;
    Career_Page careerPage = null;
    SoftwareTester_Page softwareTesterPage = null;
    ApplicationSent_Page applicationSentPage = null;
    Actions actions = null;
    String actual = null;
    Date_Picker datePicker = null;
    Dropdown_Handler dropdownHandler = null;


    @BeforeTest
    @Parameters("browser")
    public void setupTestCase(String browser){
        Reporter.log("Setup the '"+browser+"' browser",true);

        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("incognito");
        chromeOptions.addArguments("restore-last-session");

        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            Reporter.log("Firefox Start",true);
        }else if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            Reporter.log("Chrome Start",true);
        }else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            Reporter.log("Edge Start",true);
        }else{
            Reporter.log("Driver not supported",true);
        }

        actions = new Actions(driver);
        homePage = new Home_Page(driver, actions);
        careerPage = new Career_Page(driver);
        softwareTesterPage = new SoftwareTester_Page(driver);
        applicationSentPage = new ApplicationSent_Page(driver);
        datePicker = new Date_Picker(driver);
        dropdownHandler = new Dropdown_Handler(driver);

        Reporter.log("Finish Setup");
    }

    @org.testng.annotations.Test (priority = 1)
    public void navigateMenu(){
        Reporter.log("Start Navigate Menu Test Case");
        driver.get("https://www.mitrais.com/");
        homePage.AcceptCookies_click();
        homePage.AboutUS_click();
        driver.navigate().back();
        homePage.Service_click();
        driver.navigate().back();
        homePage.Service_DesktopSolution_click();
        driver.navigate().back();
        homePage.Product_click();
        driver.navigate().back();
        homePage.Product_MiningSolution_click();
        driver.navigate().back();
        homePage.Blog_click();
        driver.navigate().back();
        homePage.Blog_NewsUpdate_click();
        driver.navigate().back();
        homePage.Career_click();
        driver.navigate().back();
        homePage.Contact_click();
        homePage.Home_click();
        homePage.waitAssertionAppear();
        actual = homePage.Assert_get();
        Assert.assertEquals(actual,"You are in the right hands");
        homePage.Language_click();
        homePage.Language_Indonesia_click();
        homePage.waitAssertionAppear();
        actual = homePage.Assert_get();
        Assert.assertEquals(actual,"Anda di tangan yang tepat");
        Reporter.log("Finish Navigate Menu Test Case");
    }

    @org.testng.annotations.Test (priority = 2)
    public void applyJob(){
        Reporter.log("Start Apply Job Test Case");
        driver.get("https://www.mitrais.com/");
        //homePage.AcceptCookies_click();
        homePage.Career_click();
        careerPage.SoftwareTester_click();
        softwareTesterPage.Name_fill("name");
        softwareTesterPage.Email_fill("lowac44414@697av.com");
        softwareTesterPage.Phone_fill("080812345678");
        softwareTesterPage.DOB_select();
        datePicker.MonthYear_click();
        datePicker.Year_click();
        datePicker.Latest10Year_click();
        datePicker.Previous10Year_click();
        datePicker.y1995_choose();
        datePicker.mJanuary_choose();
        datePicker.d02_choose();
        softwareTesterPage.CurrentSalary_fill("1000");
        softwareTesterPage.ExpectedSalary_fill("2000");
        softwareTesterPage.SocialNetwork_choose();
        dropdownHandler.SocialNetwork_click();
        dropdownHandler.Telegram_choose();
        softwareTesterPage.Username_fill("@test");
        softwareTesterPage.ChooseFile_upload(cvPath);
        softwareTesterPage.SubmitApplication_click();
        applicationSentPage.waitApplicationSent();
        actual = applicationSentPage.Assert_get();
        System.out.println(actual);
        Assert.assertEquals(actual,"Application Sent");
        Reporter.log("Finish Apply Job Test Case");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
        Reporter.log("Test Case Complete", true);
    }

}
