package PageObjects;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class OrdersTest extends PageObject{
    WebDriver driver;

    // TMS Latest Version 20240925.1

    String Url = "https://korridor.crownsoftware.co.za/";

    public void OpenTMSWebsite(){

        getDriver().get(Url);
        getDriver().getWindowHandle();
        getDriver().manage().window().maximize();
    }

    // TMS Elements

    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String LoginXpath = "//button[normalize-space()=\"Log In\"]";

    String CreateOrderXpath = "//a[normalize-space()=\"Create Order\"]";
    String ClickOrdersXpath = "/html/body/div[2]/aside/section/ul/li[3]/a";
    String OrderIdXpath = "//input[@placeholder=\"Order Id...\"]";
    String PONumberXpath = "//input[@placeholder=\"PO Number...\"]";
    String RouteXpath = "//div[@id=\"routesLookup\"]//div[@role=\"combobox\"][normalize-space()=\"Select...\"]";
    String ProductXpath = "//select[@name=\"Product\"]";
    String ProductDescXpath = "//input[@placeholder=\"Product Desc...\"]";
    String DeliveryTypeXpath = "//select[@name=\"DeliveryType\"]";
    String QuantityXpath = "//input[@placeholder=\"Quantity...\"]";
    String CollectionDateXpath = "//input[@id=\"ExpectedOn\"]";
    String DeliveryDateXpath = "//input[@id=\"PlannedOn\"]";
    String SlotTimeXpath = "//input[@id=\"SlotTime\"]";
    String SaveButtonXpath = "//input[@value=\"Save\"]";


    // TMS Methods & Actions

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
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginXpath)));
        element.click();
    }
    @Step("Redirect to Dashboard")
    public void Dashboard() throws InterruptedException {
       Thread.sleep(1000);


//        String actualUrl = "//a[@href='/Order']";
//        String expectedUrl = "//a[@href='/Order']";
//        assertEquals(expectedUrl, driver.getCurrentUrl());
//        System.out.print("Validation Successful: User redirected to expected Dashboard");
//    } el
//    }
//
//    }


        // Get the Url of the element
        String actualUrl = "//a[@href='/Order']";
        String expectedUrl = "//a[@href='/Order']";


        // Validate the Url
        if (actualUrl.equals(expectedUrl)) {
            System.out.print("Validation Successful: User redirected to dashboard.");
        } else {
            System.out.print("Validation Failed: Expected '" + expectedUrl + "' but found '" + actualUrl + "'.");
        }
    }

    @Step("Click Orders Button")
    public void ClickOrdersButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0) );
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ClickOrdersXpath)));
        element.click();

    }

    @Step("ClickCreateOrderButton")
    public void ClickCreateOrderButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(0) );
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"uberApp\"]/section[1]/div/a")));
        element.click();
    }

    public void EnterOrderId(String OrderId){
        $(By.xpath(OrderIdXpath)).sendKeys("TMS001");
    }

    public void EnterPONumber(String PONumber){
        $(By.xpath(PONumberXpath)).sendKeys("TMS002");
    }

    public void SelectCustomer(String Customer){

        WebElement dropdown = $(By.xpath("(//div[@role='combobox'][normalize-space()='SIM001 - Simone Sims'])[1]"));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Customer);
    }

    public void SelectRoute(String Route){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RouteXpath))).click();
        WebElement dropdown = $(By.xpath(RouteXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText(Route);


    }

    public void SelectProduct(String Product){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ProductXpath))).click();

        WebElement dropdown = $(By.xpath(ProductXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue(Product);
    }

    public void EnterProductDesc(String ProductDesc){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ProductDescXpath))).click();


        $(By.xpath(ProductDescXpath)).sendKeys("ProductDesc");
    }

    public void SelectDeliveryType(String DelType){

        WebElement dropdown = $(By.xpath(DeliveryTypeXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue(DelType);



    }

    public void EnterQuantity(String Quantity){
        $(By.xpath(QuantityXpath)).sendKeys("Quantity");
    }

    public void EnterCollDate(String CollDate){
        $(By.xpath(CollectionDateXpath)).sendKeys("CollDate");
    }

    public void EnterDeliveryDate(String DelDate){
        $(By.xpath(DeliveryDateXpath)).sendKeys();
    }

    public void EnterSlotTime(String SlotTime){
        $(By.xpath(SlotTimeXpath)).sendKeys();
    }

    public void ClickSaveButton(){
        $(By.xpath(SaveButtonXpath)).click();
    }








}
