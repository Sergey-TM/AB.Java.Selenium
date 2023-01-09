package PageActions;
import PageComponents.TabsComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;


public class TabsActions extends TabsComponents {

    private WebDriver driver;

    public TabsActions (WebDriver webDriver){
        super(webDriver);
        driver = webDriver;
    }

    public void clickOnNewtabBtn(){
        newtabBtn().click();
    }

    public String getLastTabtext(){
        waitUntilElementClickable(newtabtext());
        return newtabtext().getText();
    }


    public void switchtolastTab(){
        for(String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }

    public String get1stTab(){
        return driver.getWindowHandle();
    }






    public void waitUntilElementClickable(WebElement element) throws Error{
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        catch(NoSuchElementException e){
            throw new Error("Element not loaded yet");
        }
    }



}
