package PageActions;
import PageComponents.FormComponents;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


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
        mobileField().sendKeys("1112223334");
    }
    public void stateFieldclick() { stateField().click();}
    public void submitBtnClick() { submitBtn().click();}

    public String getModalTitle() {  return modalTitle().getText(); }



    public void scrollPage(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",submitBtn());
     }




    /* public void mobileView(){
         Map<String, Object> deviceMetrics = new HashMap<>();
         deviceMetrics.put("width", 375);
         deviceMetrics.put("height", 812);
         deviceMetrics.put("devisescaleFactor", 0);
         deviceMetrics.put("mobile", true);

         driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
     }*/




}


