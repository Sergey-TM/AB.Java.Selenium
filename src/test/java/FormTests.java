import PageActions.FormActions;
import PageActions.TabsActions;
import PageActions.TableActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    TableActions tableActions;

    WebElement tableelement = driver.findElement(By.xpath("//div[@class='table-responsive']"));




    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DriversSelenium\\chromedriver.exe");
        driver = new ChromeDriver();
        formActions = new FormActions(driver);
        tabsActions = new TabsActions(driver);
        TableActions table = new TableActions(tableelement, driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().setSize(new Dimension(765,930));
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
        System.out.println(tableActions.getValueFromCell(2,2));

    }

    /*@AfterTest
    public void close() {
        driver.quit();
    }     */
}
