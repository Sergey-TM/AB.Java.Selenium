package PageActions;
import PageComponents.WidgetsComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



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
