import PageActions.WidgetsActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import java.time.Duration;


public class WidgetsTests {

    WebDriver driver;
    WidgetsActions widgetsActions;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\DriversSelenium\\chromedriver.exe");
        driver = new ChromeDriver();
        widgetsActions = new WidgetsActions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/slider");
    }

    @Test
    public void test3() {
        //move slider
        widgetsActions.moveSlider();

        //verify selected value
        Assert.assertEquals(widgetsActions.getsliderValue(), "54");

    }


    @AfterTest
        public void close() {
            driver.quit();
        }
}
