package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Date_Picker {
    private WebDriver driver = null;
    private final By MonthYear_button = By.cssSelector(".cfdatepicker-days .cfdatepicker-switch");
    private final By Year_button = By.cssSelector(".cfdatepicker-months .cfdatepicker-switch");
    private final By Latest10Year_button = By.cssSelector(".cfdatepicker-years .cfdatepicker-switch");
    private final By Previous10Year_button = By.cssSelector(".cfdatepicker-years .prev");
    private final By y1995_button = By.cssSelector(".year:nth-child(7)");
    private final By mJan_button = By.cssSelector(".month:nth-child(1)");
    private final By d02_button = By.cssSelector("tr:nth-child(2) > .day:nth-child(2)");

    public Date_Picker(WebDriver driver) {
        this.driver = driver;
    }

    public void MonthYear_click(){
        driver.findElement(MonthYear_button).click();
    }

    public void Year_click(){
        driver.findElement(Year_button).click();
    }

    public void Latest10Year_click(){
        driver.findElement(Latest10Year_button).click();
    }

    public void Previous10Year_click(){
        driver.findElement(Previous10Year_button).click();
    }

    public void y1995_choose(){
        driver.findElement(y1995_button).click();
        Reporter.log("Choose Year 1995",true);
    }

    public void mJanuary_choose(){
        driver.findElement(mJan_button).click();
        Reporter.log("Choose Month Januari",true);
    }

    public void d02_choose(){
        driver.findElement(d02_button).click();
        Reporter.log("Choose Day 2",true);

    }
}
