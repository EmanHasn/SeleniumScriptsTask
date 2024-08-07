package tablesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class tables {
    ChromeDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/tables");
    }
    @Test
    public void loopTable()
    {
       /* WebElement tableElement = driver.findElement(By.className("tablesorter"));
        List <WebElement> rows = tableElement.findElements(By.tagName("tr"));
        for(WebElement row : rows )
        {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols)
            {
                System.out.println(col.getText());
            }
        }*/

        WebElement tableEle = driver.findElement(By.className("tablesorter"));
        List<WebElement> rows = tableEle.findElements(By.tagName("tr"));
        for ( WebElement row:rows){
            List<WebElement> cols= row.findElements(By.tagName("td"));
            for (WebElement col:cols)
            {
                System.out.println(col.getText());
            }
        }
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }

}
