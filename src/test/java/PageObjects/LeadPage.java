package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LeadPage extends PageObject {

    String leadCheckBox = "//input[@name=\"undefined\" ]";

    String ActionSaleBtn = "//i[@class=\"bi bi-cash-coin\"]";




    @Step("Select a lead to action a sale")
    public void ActionSale(){

        //  $(By.xpath(leadCheckBox));
        //  $(By.xpath(StartSaleBtn));

        List<WebElement> checkBoxes = getDriver().findElements(By.xpath(leadCheckBox));
        List<WebElement> startSale = getDriver().findElements(By.xpath(ActionSaleBtn));

        checkBoxes.get(1).click();

        startSale.get(1).click();


    }



}
