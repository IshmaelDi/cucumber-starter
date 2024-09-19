package TMSPageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage extends PageObject{

    String Url = "https://korridor.crownsoftware.co.za/";


    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";



    String TMSLogoXpath = "//span[@class='logo-lg']";
    String ToggleNavigation = "//a[@class='sidebar-toggle']";
    String Tenant = "//a[@id='dropdownTenant']";
    String Principal = "//a[@id='dropdownPrincipal']";
    String UserEmail = "//span[@class=\"hidden-xs\"]";


    @Step("Open landingPage url")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }
    @Step("Login in using valid Credentials")
    public void loginIn(String Username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));



        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserNameXpath))).sendKeys(Username);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PasswordXpath))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginButtonXpath))).click();

    }



    @Step("Clicks on TMSLogo")
    public void ClienteleLogo()throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(TMSLogoXpath)).click();

    }

    @Step("Clicks on Toggle")
    public void CaptureSale() throws InterruptedException {
        Thread.sleep(1000);

        $(By.xpath(ToggleNavigation)).click();
    }

    @Step("Clicks on Tenant and Select Demo from Drop List")
    public void ClicksOnTenantAndSelectDemoFromDropList() throws InterruptedException {
        Thread.sleep(1000);
        // ClicksOnTenantAndSelectDemoFromDropList
        $(By.xpath(Tenant)).click();
    }

    @Step("Click on Principal And Select AutoDemo From Drop List")
    public void ClickonPrincipalAndSelectAutoDemoFromDropList() throws InterruptedException {
        Thread.sleep(1000);
        // ClickonPrincipalAndSelectAutoDemoFromDropList
        $(By.xpath(Principal)).click();
    }

    @Step("Click On UserEmail and Click LogOut Button")
    public void ClickOnUserEmailAndClickLogOutButton() throws InterruptedException {
        Thread.sleep(1000);
        // ClickOnUserEmailAndClickLogOutButton
        $(By.xpath(UserEmail)).click();
    }



}
