package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BeneficiaryPage extends PageObject {


    String BeneficiaryTitle = "//select[@id=\"Title\"]";

    String BeneficiaryName = "//input[@id=\"FirstNames\"]";

    String BeneficiarySurname = "//input[@id=\"Surname\"]";

    String Allocation = "";

    String Relationship = "//select[@id=\"Relation\"]";

    String SaveBeneficiaryInformation = "//*[@id=\"mat-dialog-16\"]/app-shamba-modal/div/div[2]/div/beneficiary-create/div/div[3]/div/div/button/span";

    @Step("Select beneficiary title")
     public void selecyBenfiTitle(String Title){
    Select c = new Select(getDriver().findElement(By.xpath(BeneficiaryTitle)));
    c.selectByValue(Title);

    }

    @Step("Enter beneficiary Name")
    public void BeneficiaryName(String beneficiaryName){
        $(By.xpath(BeneficiaryName)).sendKeys(beneficiaryName);
    }

    @Step("Enter beneficiary surname")
    public void benSurname(String beneficiarySurname){
        $(By.xpath(BeneficiarySurname)).sendKeys(beneficiarySurname);
    }

    @Step("Select beneficiary relationship")
    public void relationship(String BeneficiaryRelationship){
        $(By.xpath(Relationship)).sendKeys(BeneficiaryRelationship);
    }

    @Step("Save beneficiary information")
    public void SaveBeneInfo(){
        $(By.xpath(SaveBeneficiaryInformation)).click();
    }

}
