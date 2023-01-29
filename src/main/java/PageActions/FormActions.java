package PageActions;
import PageComponents.FormComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FormActions extends FormComponents {

    private WebDriver driver;
    public FormActions (WebDriver webDriver){
        super(webDriver);
        driver = webDriver;
    }
    public WebElement table(){ return driver.findElement(By.xpath("//div[@class='table-responsive']"));}
    public String[] formData = {"First name","Last name", "First name Last name", "qa@i.ua", "Male", "1112223334"};

    public void firstNameFieldSK() { firstNameField().sendKeys(formData[0]);}
    public void lastNameFieldSK() { lastNameField().sendKeys(formData[1]);}
    public void emailFieldSK() { emailField().sendKeys(formData[3]);}
    public void mobileFieldSK() { mobileField().sendKeys(formData[5]);}
    public void genderRadioBtnClick() {genderRadioBtn().click();}

    public void stateFieldclick() { stateField().click();}
    public void submitBtnClick() { submitBtn().click();}
    public String getModalTitle() {  return modalTitle().getText(); }


    public void scrollPage(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",submitBtn());
     }
}


