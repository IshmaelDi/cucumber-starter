package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageObject {

    String Url = "https://shambawebtest.clientele.co.za/shambaweb/login";

    String LoginBtn = "//*[@id=\"navbarSupportedContent\"]/div/div/button/span";
    String UserName = "//*[@id=\"i0116\"]";

    String NextBtn = "//*[@id=\"idSIButton9\"]";

    String Password = "//*[@id=\"i0118\"]";

    String SignIn = "//*[@id=\"idSIButton9\"]";


    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }
    @Step("Clicks on LoginButton")
    public void LoginButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60) );

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginBtn))).click();

    }
    @Step("Enter Username ")
    public void Username(String Username){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).sendKeys(Username);

    }

    @Step("Clicks on NextButton")
    public void NextButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60) );

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NextBtn))).click();

    }

    @Step("Enter Password")
    public void Password(String password){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Password))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Password))).sendKeys(password);

    }

    @Step("Clicks on SignIn")
    public void SignIn(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60) );

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SignIn))).click();
    }



}
