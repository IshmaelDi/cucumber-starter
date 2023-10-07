package PageObjects;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PayerPage extends PageObject {

    String Payertitle = "//select[@id=\"Title\"]" ;
    String Names = "//input[@id=\"FirstNames\"]" ;
    String Surname = "//input[@id=\"Surname\"]" ;
    String MobileNum = "//input[@id=\"MobileTelephoneNumber\"]" ;
    String relationship = "//select[@id=\"RelationToMember\"]" ;
    String DebitDay = "//select[@id=\"DebitDay\"]" ;
    String FirstDebitDate = "//select[@id=\"FirstDebitDate\"]" ;
    String IsEmployee = "//select[@id=\"IsEmployee\"]" ;

    String BankName = "//select[@id=\"BankName\"]" ;

    String Branchcode = "id=\"BankBranchCode\"" ;
    String AccountType = "//select[@id=\"BankAccountType\"]" ;
    String AccountNumber = "//input[@id=\"BankAccountNumber\"]" ;

    String CheckBoxBankNum = "//*[@id=\"pills-tabContent\"]/payer/div/div[2]/div/div/ul/li/ul/li[1]/input";

    String checkBoxtranscation = "//*[@id=\"pills-tabContent\"]/payer/div/div[2]/div/div/ul/li/ul/li[2]/input";



    @Step("Select payer title ")
    public void PayerTitle(String PayerTitle){
        Select produuct = new Select(getDriver().findElement(By.xpath(Payertitle)));
        produuct.selectByValue(PayerTitle);
    }

    @Step("Enter payer name")
    public void EnterPayerName(String payerName){
        $(By.xpath(Names)).sendKeys(payerName);
    }
    @Step("Enter payer surname")
    public void EnterPayerSurname(String payerSurname){
        $(By.xpath(Surname)).sendKeys(payerSurname);
    }
    @Step("Enter payer mobile number ")
    public void mobileNum(String Number){
        $(By.xpath(MobileNum)).sendKeys(Number);

    }
    @Step("select payer relationship")
    public void selectRelationship(String RealationshipWithPayer){
        Select produuct = new Select(getDriver().findElement(By.xpath(relationship)));
        produuct.selectByValue(RealationshipWithPayer);
    }
    @Step("select debit day")
    public void Debitday(String dayOfDebit){

        Select produuct = new Select(getDriver().findElement(By.xpath(DebitDay)));
        produuct.selectByValue(dayOfDebit);
    }
    @Step("select day of first debit")
    public void Firstdebitday(String firstDayOfDebit){
        Select produuct = new Select(getDriver().findElement(By.xpath(DebitDay)));
        produuct.selectByValue(firstDayOfDebit);
    }
    @Step("Select bank name")
    public void Bankname(String selectBankName){
        Select produuct = new Select(getDriver().findElement(By.xpath(BankName)));
        produuct.selectByValue(selectBankName);
    }

    @Step("select bank branch code")
    public void bankBranchcode(String branchcode){
        Select produuct = new Select(getDriver().findElement(By.xpath(Branchcode)));
        produuct.selectByValue(branchcode);
    }
    @Step("Select account type")
    public void AccType(String Accounttype){
        Select produuct = new Select(getDriver().findElement(By.xpath(AccountType)));
        produuct.selectByValue(Accounttype);

    }
    @Step("Enter Account number")
    public void enterAccountNumber(String accountNumber){
        $(By.xpath(AccountNumber)).sendKeys(accountNumber);
    }

    @Step("confirm client number is the same as bank number")
    public void clientNumConfirmation(){
        $(By.xpath(CheckBoxBankNum)).click();

    }
    @Step("confirm with client that the bank sends any transaction messages on this number")
    public void transactionMessagesConfirmation(){
        $(By.xpath(checkBoxtranscation)).click();
    }
}
