package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LeadPage;
import PageObjects.ProductPage;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;




public class individualCover extends PageObjects {

    @Steps
    HomePage homePage;

    @Steps
    LeadPage leadPage;

    ProductPage productPage;

    public individualCover(WebDriver driver) {
        super(driver);
    }

    @Given("a consultant is logged in to single gui")
    public void a_consultant_is_logged_in_to_single_gui() throws InterruptedException {
        homePage.OpenWebsite();
        homePage.loginIn("mamazibuko@clientele.co.za", "Phuthini96!");
        Thread.sleep(50000);
        homePage.captureSale();
        homePage.clickLeadBasket();
        leadPage.ActionSale();

        productPage.SelectHELP();
        productPage.selectPlanType("YG");
        productPage.clickOkBtn();
        productPage.GetRates();
        Thread.sleep(1500000);
    }
    @When("a consultant starts a individual cover")
    public void a_consultant_starts_a_individual_cover(String PlanOption){
        productPage.SelectPlanOption(PlanOption);
        productPage.mainLifeDOB();
        
    }

}
