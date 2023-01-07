import PageActions.TabsActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SomeTests  {
    WebDriver driver;
    TabsActions tabsActions;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sergey.tolochny\\IdeaProjects\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        tabsActions = new TabsActions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
    }

    @Test
    public void test1() {
        tabsActions.Btn_click();
        //driver.findElement(By.xpath("//button[@id='tabButton']")).click();


        /*@AfterTest
        public void end () {
            driver.quit();
        }
         */

    }
}


