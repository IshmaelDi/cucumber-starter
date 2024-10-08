package PageObjects;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;;

public class CreateTripTemplateNotSaving extends PageObject {

    String Url = "https://apptest.korridor.com/";
    public void OpenKorridorWebsite(){

        getDriver().get(Url);
        getDriver().getWindowHandle();
        getDriver().manage().window().maximize();

    }


    String UserNameXpath = "//*[@id=\"username\"]";
    String PasswordXpath = "//*[@id=\"password\"]";
    String LoginXpath = "//*[@id=\"login-btn\"]";

    // Switch to confirm pop up alert for Notice.

    String NoticeXpath = "//div[@class='modal-body']";
    String SwitchCompanyProfileXpath = "(//div[@class='modal-content'])[2]";
    String SwitchXpath = "/html/body/div[9]/div";











    String NoticeOKButtonXpath = "//button[normalize-space()='OK']";
    String CreateTripXpath = "//a[normalize-space()='Create or Recreate a Trip']";
    String NewTripXpath = "//a[normalize-space()='Create a new trip']";


    String DriverShowTempCheckBOXXpath = "//*[@id=\"create-form\"]/div/div/div[1]/div[1]/div[1]/input";
    String CLickSelectDriverXpath = "//span[normalize-space()='Select a Driver']";
    String ChooseDriveXpath = "//*[@id=\"create-form\"]/div/div/div[1]/div[1]/div[2]/a/span";

    String TruckShowTempCheckBOXXpath = "//*[@id=\"create-form\"]/div/div/div[1]/div[3]/div[1]/input";
    String ClickSelectTruckXpath = "//*[@id=\"create-form\"]/div/div/div[1]/div[3]/div[2]/a/span";
    String ChooseTruckXpath = "//*[@id=\"create-form\"]/div/div/div[1]/div[3]/div[2]/a";

    String CountryCheckBOxXpath = "//*[@id=\"create-form\"]/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/label/input";
    String CurrencyBoxXpath = "//*[@id=\"account-buttons---\"]/label[1]";
    String ContinueButtonXpath = "//*[@id=\"create-form\"]/div/div/div[2]/div[25]/div/button";



    // Trip Methods

    @Step("Enter UserName")
    public void EnterUserName(String string1) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys(string1);
    }

    @Step("Enter Password")
    public void EnterPassword(String string2) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(string2);

    }
    @Step("Click Login")
    public void Login(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginXpath))).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginXpath)));

        element.click();

    }

    // Switch Company Profile Pop Up.

    @Step("There will be a pop window for company profile selection")
    public void CompanyProfileNotice(){
        boolean isNoticeInfoDisplayed = $(By.xpath(SwitchCompanyProfileXpath)).isDisplayed();

        //Implement Alert



        if (isNoticeInfoDisplayed){

            System.out.println(("Notice information is displayed : IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates IMPORTANT NOTICE - Diesel Africa Lusaka will be closed on the following dates, 24 June 2019 to 28 June 2019 and between 6 July 2019 to 9 July 2019 for fuel collections, due to a road upgrade." + $(By.xpath(SwitchCompanyProfileXpath)).getText()));
        }else
        {

            Assert.fail("Notice Information not Displayed");
        }
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SwitchCompanyProfileXpath)));
    }




}
