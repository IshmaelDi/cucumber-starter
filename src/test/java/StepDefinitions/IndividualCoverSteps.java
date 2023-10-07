package StepDefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.HomePage;
import PageObjects.LeadPage;
import PageObjects.ProductPage;

import java.time.Duration;

public class IndividualCoverSteps extends PageObject {

    @Steps
    HomePage homePage;
    @Steps
    LeadPage leadPage;
    @Steps
    ProductPage productPage;




    @Given("A consultant is logged in to single GUI.")
    public void a_consultant_is_logged_in_to_single_gui() throws InterruptedException {
        homePage.OpenWebsite();
        homePage.loginIn("mamazibuko@clientele.co.za", "Phuthini96!");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        homePage.captureSale();
        homePage.clickLeadBasket();
        leadPage.ActionSale();

        productPage.SelectHELP();
        productPage.selectPlanType("YG");
        productPage.clickOkBtn();
        productPage.GetRates();

        }
    @Given("Select an Individual cover from product drop list.")
    public void select_an_individual_cover_from_product_drop_list() {



        }
    @Given("Captures required details {string},{string}")
    public void captures_required_details(String string, String string2) {

    }

    }


