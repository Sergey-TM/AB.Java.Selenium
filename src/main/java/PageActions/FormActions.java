package PageActions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class FormActions  {

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement emailField;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    public WebElement genderRadioBtn;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement mobileField;

    @FindBy(xpath = "//div[@id='state']")
    public WebElement stateField;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    public WebElement modalTitle;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement getTable;




    private WebDriver driver;
    private WebDriverWait wait;
    public FormActions (WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open(){
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.manage().window().setSize(new Dimension(760,900));
    }


    public void firstNameFieldSK() {
        firstNameField.sendKeys("First name");
    }
    public void lastNameFieldSK() {
        lastNameField.sendKeys("Last name");
    }
    public void emailFieldSK() {
        emailField.sendKeys("qa@i.ua");
    }
    public void genderRadioBtnClick() {genderRadioBtn.click();}
    public void mobileFieldSK() {
        mobileField.sendKeys("1112223334");
    }
    public void stateFieldclick() { stateField.click();}
    public void submitBtnClick() { submitBtn.click();}

    public String getModalTitle() {  return modalTitle.getText(); }



    public void scrollPage(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",submitBtn);
     }
}


