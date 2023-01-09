import PageActions.TabsActions;
import PageComponents.TabsComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TabsTest {
     WebDriver driver;
     TabsActions tabsActions;
     TabsComponents pageComponents;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
        driver = new ChromeDriver();
        tabsActions = new TabsActions(driver);
        pageComponents = new TabsComponents(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void test2() {
        // remember first tab
        String maintab = tabsActions.get1stTab();
        //click on button
        tabsActions.clickOnNewtabBtn();
        //switch to new tab
        tabsActions.switchtolastTab();
        //verify text
        Assert.assertEquals(tabsActions.getLastTabtext(), "This is a sample page");
        //switch to 1st tab
        driver.switchTo().window(maintab);
        //System.out.println(driver.getTitle());
        //verify 1st tab title
        Assert.assertEquals(driver.getTitle(),"Tools");
    }




    @AfterTest
        public void close() {
            driver.quit();
        }



    }



