package PageActions;
import PageComponents.FormComponents;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class FormActions extends FormComponents {

    private WebDriver driver;


    public FormActions (WebDriver webDriver){
        super(webDriver);
        driver = webDriver;
    }


    public void firstNameFieldSK() {
        firstNameField().sendKeys("First name");
    }
    public void lastNameFieldSK() {
        lastNameField().sendKeys("Last name");
    }
    public void emailFieldSK() {
        emailField().sendKeys("qa@i.ua");
    }
    public void genderRadioBtnClick() {genderRadioBtn().click();}
    public void mobileFieldSK() {
        mobileField().sendKeys("111222333");
    }
    public void submitBtnClick() { submitBtn().click();}
    public String getModalTitle() {  return modalTitle().getText(); }

public void scrollPage(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",submitBtn());
}


    }


