package StepDefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;
import PageObjects.HomePage;
import PageObjects.LeadPage;
import PageObjects.ProductPage;

public class IndividualCoverSteps extends PageObjects {





    public IndividualCoverSteps(WebDriver driver) {
        super(driver);

        @Given("A consultant is logged in to single GUI.")
        public void a_consultant_is_logged_in_to_single_gui() {

        }
        @Given("Select an Individual cover from product drop list.")
        public void select_an_individual_cover_from_product_drop_list() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Given("Captures required details <Title>, {string}")
        public void captures_required_details_title(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

    }
}
