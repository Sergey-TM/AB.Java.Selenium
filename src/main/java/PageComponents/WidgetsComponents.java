package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetsComponents {

    WebDriver driver;
    public WidgetsComponents(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement slider() {
        return driver.findElement(By.xpath("//input[@type='range']"));
    }

    public WebElement sliderValue() {
        return driver.findElement(By.xpath("//input[@id='sliderValue']"));
    }



}
