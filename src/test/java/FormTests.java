import PageActions.FormActions;
import PageActions.TabsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;


public class FormTests {
    WebDriver driver;
    FormActions formActions;
    TabsActions tabsActions;



    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
        driver = new ChromeDriver();
        formActions = new FormActions(driver);
        tabsActions = new TabsActions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void test2() {
        //fill form with valid data
        formActions.firstNameFieldSK();
        formActions.lastNameFieldSK();
        formActions.emailFieldSK();
        formActions.genderRadioBtnClick();
        formActions.mobileFieldSK();
        //scroll the page
        formActions.scrollPage();
        //submit form
        formActions.submitBtnClick();
        //switch to modal
        tabsActions.switchtolastTab();
        //verify modal title
        Assert.assertEquals(formActions.getModalTitle(), "Thanks for submitting the form");

    }


    /*@AfterTest
    public void close() {
        driver.quit();
    }

     */


}
