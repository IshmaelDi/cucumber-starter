package TMSStepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import TMSPageObjects.TMSPage;


public class StepsDefUI extends PageObject {


    @Steps

    TMSPage tmsPage;





    @Given("Driver has launched TMS Platform")
    public void driver_has_launched_tms_platform() {
        tmsPage.TMSWebsite();


    }
    @When("Driver Captures UserName and Password")
    public void driver_captures_user_name_and_password() {
        tmsPage.LogIn("ishmael.direro@korridor.com", "WjZKlhrA");
    }
    @When("Driver click Login")
    public void driver_click_login() {
        tmsPage.Click();
    }
    @When("Click Order Button")
    public void click_order_button() throws InterruptedException {
        tmsPage.Order();
    }

    @When("Click Create Order Button")
    public void click_create_order_button() throws InterruptedException {
        tmsPage.CreateOrder();
    }
    @When("Enter {string} and {string}")
    public void enter_and(String string, String string2) {
        tmsPage.EnterOrderId(string);
        tmsPage.EnterPONumber(string2);
    }
    @When("Select {string}, {string}, {string}, Capture {string}, select {string} and Capture {string}")
    public void select_capture_select_and_capture(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
        tmsPage.SelectCustomer(string);
        tmsPage.SelectRoute(string2);
    }
    @When("Enter {string}, {string} and {string}")
    public void enter_and(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Click SaveButton")
    public void click_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}
