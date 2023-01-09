package PageActions;
import PageComponents.WidgetsComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;

public class WidgetsActions extends WidgetsComponents {

    private WebDriver driver;


    public WidgetsActions (WebDriver webDriver){
        super(webDriver);
        driver = webDriver;
    }



    public void  moveSlider() {
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider(), 30, 255).perform();
    }

    public String getsliderValue(){
        return sliderValue().getAttribute("value");
    }
}
