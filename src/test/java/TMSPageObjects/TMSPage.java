package TMSPageObjects;



import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TMSPage extends PageObject{

    // elements

    String Url = "https://korridor.crownsoftware.co.za/";
    String UserNameXpath = "//input[@id='Input_Email']";
    String PasswordXpath = "//input[@id='Input_Password']";
    String LoginButtonXpath = "//button[normalize-space()='Log In']";

   // Landing Page Elements

   String TenantDropXpath = "//*[@id=\"dropdownTenant\"]";

   // New Order Elements

    String OrderIdXpath = "//input[@placeholder='Order Id...']";
    String PONumberXpath = "//input[@placeholder='PO Number...']";
    String ClickDropListCustomerXpath = "//*[@id=\"devextreme0\"]/div/div[1]";
    String SelectCustomerDropListXpath = "//*[@id=\"devextreme0\"]/div[1]/div[1]";
    String ClickDropListRouteXpath = "(//div[@role='combobox'])[2]";
    String SelectRouteXpath = "//*[@id=\"routesLookup\"]/div[1]/div[1]";
    String ClickDropListProductXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[3]/div[1]/select";
    String SelectProductXpath = "(//select[@title='Product'])[1]";
    String ProductDesXpath = "//input[@placeholder='Product Desc...']";
    String ClickDelTypeDropListXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[4]/div/select";
    String SelectDelTypeXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[4]/div/select";
    String QTYXpath = "//*[@id=\"uberForm\"]/section[2]/div[2]/div/div[5]/div/input";
    String CollectionDAteXpath = "//*[@id=\"ExpectedOn\"]";
    String DelDateXpath = "//*[@id=\"PlannedOn\"]";
    String SlotTimeXpath = "//*[@id=\"SlotTime\"]";
    String SaveButtonXpath = "//input[@value='Save']";

    // Action Login Tests

  @Step("Launched TMS Website")
    public void TMSWebsite(){
      getDriver().get(Url);
      getDriver().manage().window().maximize();
  }

  @Step("Driver Captures UserName and Password")
    public void LogIn(String UserName, String Password) {

      WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(UserNameXpath))).sendKeys(UserName);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PasswordXpath))).sendKeys(Password);

  }

  @Step("CLick LogIn Button")
    public void Click(){
      WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginButtonXpath))).click();
  }

  @Step("Click on Tenant and select Demo from drop list")
    public void SelectDemo() throws InterruptedException {
      Thread.sleep(1000);
      WebElement dropList = $(By.xpath(TenantDropXpath));
      Select selectObject = new Select(dropList);
      selectObject.selectByValue("2");
  }

  @Step("Click Order")
    public void Order() throws InterruptedException {
      Thread.sleep(1000);

      WebElement button = $(By.xpath("//html/body/div[2]/aside/section/ul/li[3]/a/span"));
      button.click();
  }
    public void CreateOrder() throws InterruptedException {
      Thread.sleep(1000);

      WebElement button = $(By.linkText("Create Order"));
      button.click();
  }

    public void EnterOrderId(String OrderId){
        $(By.xpath(OrderIdXpath)).sendKeys("OrderId");
    }

    public void EnterPONumber(String PONumber){
        $(By.xpath(PONumberXpath)).sendKeys("PONumber");

    }

    public void SelectCustomer(String Customer) throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropList1 = $(By.xpath(SelectCustomerDropListXpath));
        Select selectObject = new Select(dropList1);
        selectObject.selectByValue("2");;
    }
    public void SelectRoute(String Route) throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropList1 = $(By.xpath(ClickDropListRouteXpath));
        Select selectObject = new Select(dropList1);
        selectObject.selectByValue("2");;
    }

    public void SelectProduct(String Product) throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropList1 = $(By.xpath(ClickDropListRouteXpath));
        Select selectObject = new Select(dropList1);
        selectObject.selectByValue("2");;
    }

    public void EnterProductDesc(String ProductDesc) throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropList1 = $(By.xpath(ClickDropListRouteXpath));
        Select selectObject = new Select(dropList1);
        selectObject.selectByValue("2");;
    }

    public void SelectDeliveryType(String DelType) throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropList1 = $(By.xpath(ClickDropListRouteXpath));
        Select selectObject = new Select(dropList1);
        selectObject.selectByValue("2");;
    }

    public void EnterQuantity(String Quantity) throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropList1 = $(By.xpath(ClickDropListRouteXpath));
        Select selectObject = new Select(dropList1);
        selectObject.selectByValue("2");;
    }
//
//    public void EnterCollDate(String CollDate){
//        $(By.xpath(CollectionDateXpath)).sendKeys("CollDate");
//    }
//
//    public void EnterDeliveryDate(String DelDate){
//        $(By.xpath(DeliveryDateXpath)).sendKeys();
//    }

    public void EnterSlotTime(String SlotTime){
        $(By.xpath(SlotTimeXpath)).sendKeys();
    }

    public void ClickSaveButton(){
        $(By.xpath(SaveButtonXpath)).click();
    }





}

