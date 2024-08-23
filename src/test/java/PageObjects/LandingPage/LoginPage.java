package PageObjects.LandingPage;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DefaultUrl("https://apptest.korridor.com")

public class LoginPage extends PageObject {

    java.lang.String Url = "https://apptest.korridor.com/login";

    java.lang.String UserName = "//input[@id='username']";
    java.lang.String Password = "//input[@id='password']";
    String SignInButton = "//button[@id='login-btn']";


    // Then There will be a popUp Switch Company Profile

    // Implement the Solution Idea.



    @Step("Open Korridor website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
        }

    public void UserName() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(UserName)));
        element.click();

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id(Password)));
        element1.click();
    }

    public void SignInButton() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        // As I have 3 Different Elements, I am going to name 3rd elements as element3.

        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.id(SignInButton)));
        element3.click();

    }
    }



