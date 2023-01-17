package PageActions;
import PageComponents.FormComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableActions {
    private WebElement tableElement;
    private WebDriver driver;

    public TableActions(WebElement tableElement, WebDriver driver){
        this.tableElement = tableElement;
        this.driver = driver;
    }

    public List<WebElement> getRows(){
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        rows.remove(0);
        return rows;
    }

    public List<WebElement> getHeadings(){
        WebElement headingRow = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headingcolumns = headingRow.findElements(By.xpath("./th"));
        return headingcolumns;
    }

}
