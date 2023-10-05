package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PremiumPage extends PageObject {

    String SavePremiumInformation = "//*[@id=\"pills-tabContent\"]/premium/div/div/div/div[4]/div/div/div/button/span";



     @Step("Save premium information")
    public void SavePremInfomation(){
        $(By.xpath(SavePremiumInformation)).click();
     }

}
