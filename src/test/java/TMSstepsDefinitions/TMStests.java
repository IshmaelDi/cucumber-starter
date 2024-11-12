package TMSstepsDefinitions;


import TMSPageObjects.TMSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;


public class TMStests extends PageObject{

    @Steps
    TMSPage tmsPage;

    @Given("User has valid data and information to create order.")
    public void user_has_valid_data_and_information_to_create_order() {
        tmsPage.TMSWebsite();
    }
    @Given("User logs into TMS Website")
    public void user_logs_into_tms_website() {
       tmsPage.LogIn("ishmael.direro@korridor.com", "Ish@cyest#982");
       tmsPage.Click();
    }
    @Given("Redirected to dashboard to create order")
    public void redirected_to_dashboard_to_create_order() throws InterruptedException {
        tmsPage.Order();
    }
    @Given("User click create order button")
    public void user_click_create_order_button() throws InterruptedException {
        tmsPage.CreateOrder();
    }
    @Given("Captures and Select Order Information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}.")
    public void captures_and_select_order_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
        tmsPage.EnterOrderId(string);
        tmsPage.EnterPONumber(string2);
        tmsPage.SelectCustomer();
        tmsPage.SelectRoute();
        tmsPage.SelectProduct(string5);
        tmsPage.EnterProductDesc(string6);
        tmsPage.SelectDeliveryType(string7);
        tmsPage.EnterQuantity(string8);
        tmsPage.EnterSlotTime(string9);
    }
    @Then("Click Save Button.")
    public void click_save_button() throws InterruptedException {
        tmsPage.ClickSaveButton();
    }
//    @And("Click Edit Button")
//    public void clickEditButton() throws InterruptedException {
//        tmsPage.CLICKEDIT();
//    }
//    @And("Click Auth Button")
//    public void clickAuthButton() {
//        tmsPage.AuthClick();
//    }
}
