package stepsDefinition;

import PageObjects.OrdersTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class OrdersStepTests extends PageObject{


    @Steps
    OrdersTest ordersTest;

    // Order Steps

    @Given("User has valid data and information to create order.")
    public void user_has_valid_data_and_information_to_create_order() {
        ordersTest.OpenTMSWebsite();
    }
    @When("User logs into TMS Website")
    public void user_logs_into_tms_website() {
        ordersTest.EnterUserName("ishmael.direro@korridor.com");
        ordersTest.EnterPassword("Ish@cyest#982");
        ordersTest.Login();
    }
    @And("Redirected to dashboard to create order")
    public void redirected_to_dashboard_to_create_order() throws InterruptedException {
        ordersTest.Dashboard();
        ordersTest.ClickOrdersButton();
    }


    @And("User click create order button")
    public void user_click_create_order_button() {
        ordersTest.ClickCreateOrderButton();
    }
    @And("Captures and Select Order Information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}.")
    public void captures_and_select_order_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        ordersTest.EnterOrderId(string);
        ordersTest.EnterPONumber(string2);
        ordersTest.SelectCustomer(string3);
        ordersTest.SelectRoute(string4);
        ordersTest.SelectProduct(string5);
        ordersTest.EnterProductDesc(string6);
        ordersTest.SelectDeliveryType(string7);
        ordersTest.EnterQuantity(string8);
        ordersTest.EnterCollDate(string9);
        ordersTest.EnterDeliveryDate(string10);
        ordersTest.EnterSlotTime(string11);
    }

    @Then("Click Save Button.")
    public void click_save_button() {
        ordersTest.ClickSaveButton();
    }

}
