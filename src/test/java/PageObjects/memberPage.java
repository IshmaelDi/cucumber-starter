package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class memberPage extends PageObject {

    String Title = "//select[@id='Title']"  ;

    String Name = "//input[@id=\"FirstNames\" ]";

    String Surname = "//input[@id=\"Surname\"]";

    String CellNumber = "//input[@id=\"MobileTelephoneNumber\" ]";

    String SouthAfricanCitizen  = "//select[@id=\"IsSouthAfricanCitizen\"]";

    String IDNum = "//input[@id=\"IdentityNumber\"]";

    String DOB = "";

    String MonthlyIncome = "//select[@id=\"MonthlyIncomeRange\"]";

    String Occupation = "//select[@id=\"Occupation\"]";
    String Education = "//select[@id=\"EducationLevel\"]";
    String PostalAddress = "//input[@id=\"PhysicalAddressLine1\"]";
    String PostalCode = "//input[@id=\"PhysicalAddressCode\"]";
    String SaveMainMember = "//*[@id=\"pills-tabContent\"]/member/div/div[2]/div/div[2]/button";

    String CopyToPhysical = "//*[@id=\"ngb-nav-1-panel\"]/div[1]/div/div/button/span[1]";
    String ValidateBtn = "//*[@id=\"pills-tabContent\"]/member/div/div[1]/div/form/div/div[2]/div[5]/div/shamba-address/div/div[2]/div[3]/div/button/span";





    @Step("Select main member Title")
    public void SelectTitle(String title){

        Select titlee = new Select(getDriver().findElement(By.xpath(Title)));
        titlee.selectByValue(title);

    }
    @Step("Enter main member Name ")
    public void EnterName(String name){
        $(By.xpath(Name)).sendKeys(name);

    }
    @Step("Enter main member surname")
    public void enterSurname(String surname){
        $(By.xpath(Surname)).sendKeys(surname);

    }
    @Step("Enter main member cell number")
    public void EnterCellNumber(String Cellnumber){
        $(By.xpath(CellNumber)).sendKeys(Cellnumber);

    }
    @Step("Select main member citizenship ")
    public void SelectCitizenship( String CitizenshipYesNo){

        Select Citizen = new Select(getDriver().findElement(By.xpath(SouthAfricanCitizen)));
        Citizen.selectByValue(CitizenshipYesNo);

    }
    @Step("Enter main member ID number ")
    public void enterIdNumber(String MainMemberIDNUM){
        $(By.xpath(IDNum)).sendKeys(MainMemberIDNUM);
    }
    @Step("select Date of Birth for main member")
    public void MainMemberDOB(){
    }


    @Step(" select Monthly income for main member")
    public void selectMonthlyIncome(String MainMemberincome){

        Select income = new Select(getDriver().findElement(By.xpath(MonthlyIncome)));
        income.selectByValue(MainMemberincome);

    }
    @Step(" select occupation for main member")
    public void selectOccupation(String MainMemberOccupation){
        Select occupation = new Select(getDriver().findElement(By.xpath(Occupation)));
        occupation.selectByValue(MainMemberOccupation);

    }
    @Step(" select Monthly income for main member")
    public void selectEducation(String MainMemberEducation){

        Select education = new Select(getDriver().findElement(By.xpath(Education)));
        education.selectByValue(MainMemberEducation);

    }

    @Step("Enter main physical address ")
    public void enterPhysicalAddress(String MainMemberPhysicalAddress){
        $(By.xpath(PostalAddress)).sendKeys(MainMemberPhysicalAddress);
    }
    @Step("Enter postal code for main member")
    public void enterPostalCode(String Postalcode){
        $(By.xpath(PostalCode)).sendKeys(Postalcode);
    }

    @Step("copy to physical ")
    public void copyToPhysical(){
        $(By.xpath(CopyToPhysical)).click();
    }
    @Step("Validate information")
    public void clickValidate(){
        $(By.xpath(ValidateBtn)).click();
    }
    @Step("Save main member details")
    public void clickSaveMainMember(){
        $(By.xpath(SaveMainMember)).click();
    }

}
