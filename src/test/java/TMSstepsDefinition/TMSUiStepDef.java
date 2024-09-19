package TMSstepsDefinition;


import TMSPageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class TMSUiStepDef extends PageObject{

    @Steps
    LoginPage loginPage;

    @Given("User has launched TMS Website")
    public void user_has_launched_tms_website() {
        loginPage.OpenTMSWebsite();
    }
    @When("User captured valid Username and Password")
    public void user_captured_valid_username_and_password() {
        loginPage.EnterUserName("ishmael.direro@korridor.com");
        loginPage.EnterPassword("Ish@cyest#982");
    }
    @When("Click LogIn Button and Navigate to Dashboard")
    public void click_log_in_button_and_navigate_to_dashboard() {
        loginPage.ClickLoginButton();

    }
}
