package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class SoftwareTester_Page {

    private WebDriver driver = null;
    private final By Name_field = By.xpath("//*[@id=\"fld_8768091_1\"]");
    private final By Email_field = By.xpath("//*[@id=\"fld_6009157_1\"]");
    private final By Phone_field = By.xpath("//*[@id=\"fld_6210925_1\"]");
    private final By DOB_field = By.xpath("//*[@id=\"fld_7673494_1\"]");
    private final By CurrentSalary_field = By.xpath("//*[@id=\"fld_7683514_1\"]");
    private final By ExpectedSalary_field = By.xpath("//*[@id=\"fld_3052758_1\"]");
    private final By SocialNetwork_radio = By.xpath("//*[@id=\"fld_7800700_1_opt1438810\"]");
    private final By SocialNetwork_dropdown = By.xpath("//*[@id=\"fld_8589119_1\"]");
    private final By Username_field = By.xpath("//*[@id=\"fld_3258133_1\"]");
    private final By ChooseFile_button = By.xpath("//*[@id=\"fld_2240024_1\"]");
    private final By SubmitApplication_button = By.xpath("//*[@id=\"fld_7908577_1\"]");

    public SoftwareTester_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void Name_fill(String name){
        driver.findElement(Name_field).sendKeys(name);
        Reporter.log("Fill the Name",true);
    }

    public void Email_fill(String email){
        driver.findElement(Email_field).sendKeys(email);
        Reporter.log("Fill the Email",true);
    }

    public void Phone_fill(String phoneNumber){
        driver.findElement(Phone_field).sendKeys(phoneNumber);
        Reporter.log("Fill the Phone Number", true);
    }

    public void DOB_select(){
        driver.findElement(DOB_field).click();
        Reporter.log("DOB field clicked",true);
    }

    public void CurrentSalary_fill(String currentSalary){
        driver.findElement(CurrentSalary_field).sendKeys(currentSalary);
        Reporter.log("Fill the Current Salary",true);
    }

    public void ExpectedSalary_fill(String expectedSalary){
        driver.findElement(ExpectedSalary_field).sendKeys(expectedSalary);
        Reporter.log("Fill the Expected Salary",true);
    }

    public void SocialNetwork_choose(){
        driver.findElement(SocialNetwork_radio).click();
        Reporter.log("Social Network radio choose",true);
    }

    public void SocialNetwork_click(){
        driver.findElement(SocialNetwork_dropdown).click();
        Reporter.log("Social Network dropdown clicked",true);
    }

    public void Username_fill(String username){
        driver.findElement(Username_field).sendKeys(username);
        Reporter.log("Fill the Username",true);
    }

    public void ChooseFile_upload(String path){
        driver.findElement(ChooseFile_button).sendKeys(path);
        Reporter.log("CV uploaded",true);
    }

    public void SubmitApplication_click(){
        driver.findElement(SubmitApplication_button).click();
        Reporter.log("Submit Application clicked",true);
    }
}
