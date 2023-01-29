package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormComponents {
    WebDriver driver;
    public FormComponents(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement firstNameField() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }
    public WebElement lastNameField() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }
    public WebElement emailField() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }
    public WebElement genderRadioBtn() {
        return driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
    }
    public WebElement mobileField() {
        return driver.findElement(By.xpath("//input[@id='userNumber']"));
    }

    public WebElement dateOfbirthField() {
        return driver.findElement(By.xpath(""));
    }
    public WebElement subjectsField() {
        return driver.findElement(By.xpath(""));
    }
    public WebElement hobbiesField() {
        return driver.findElement(By.xpath(""));
    }
    public WebElement addressField() {
        return driver.findElement(By.xpath(""));
    }
    public WebElement choseFileField() {
        return driver.findElement(By.xpath(""));
    }
    public WebElement stateField() {   return  driver.findElement(By.xpath("//div[@id='state']"));    }
    public WebElement cityField() {
        return driver.findElement(By.xpath(""));
    }


    public WebElement submitBtn() {
        return driver.findElement(By.xpath("//button[@id='submit']"));
    }

    //Modal window
    public WebElement modalTitle() { return driver.findElement(By.xpath("//div[@id='example-modal-sizes-title-lg']"));}
    //public WebElement tableelement = driver.findElement(By.xpath("//div[@class='table-responsive']"));
}
