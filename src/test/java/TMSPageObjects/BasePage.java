package TMSPageObjects;



import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.pages.PageObject;

import java.time.Duration;

public class BasePage extends PageObject{
    // elements

    String Url = "https://korridor.crownsoftware.co.za/";

    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";

    // action Login Tests

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
}

