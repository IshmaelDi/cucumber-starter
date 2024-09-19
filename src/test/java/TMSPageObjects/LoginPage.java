package TMSPageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageObject{

    String Url = "https://korridor.crownsoftware.co.za/";
    public void OpenTMSWebsite(){
        getDriver().get(Url);
        getDriver().getWindowHandle();
        getDriver().manage().window().maximize();
    }

    // Add login Page elements

    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";

    // Add Login Methods

    @Step("Enter UserName")
    public void EnterUserName(String string1){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys("ishmael.direro@korridor.com");
    }

    @Step("Enter Password")
    public void EnterPassword(String string2){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys("Ish@cyest#982");
    }

    @Step("Click LoginButton")
    public void ClickLoginButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginButtonXpath))).click();

    }


}
