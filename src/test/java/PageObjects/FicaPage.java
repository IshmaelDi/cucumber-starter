package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class FicaPage extends PageObject {

    String SaveFicaBtn = "//*[@id=\"pills-tabContent\"]/fica-declaration/div/div[2]/div/div/button/span";




    @Step("Save FICA response ")
    public void SaveFicaResponse(){
        $(By.xpath(SaveFicaBtn)).click();

    }

}
