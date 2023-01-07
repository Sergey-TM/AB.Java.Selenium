package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsActions {
   private WebDriver driver;
    public TabsActions(WebDriver driver) {
        this.driver=driver;
    }


    //locators
    By pageheader = By.xpath("//div[@class='pattern-backgound playgound-header']");
    //WebElement newtabBtn = driver.findElement(By.xpath("//button[@id='tabButton']"));
    By newtabBtn = By.xpath("//button[@id='tabButton']");
    WebElement newtabtext = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));

    WebElement newwindowBtn = driver.findElement(By.xpath("//button[@id='windowButton']"));
    WebElement newwindowmessageBtn = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));



    public void Btn_click() {
         driver.findElement(newtabBtn).click();
    }
}
