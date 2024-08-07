package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkboxes {
    ChromeDriver driver = new ChromeDriver();
    @BeforeTest
    public void OpenUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
    }
    @Test
    public void testCheck()
    {
        WebElement checky = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        if(!checky.isSelected())
        {
            checky.click();
        }
    }

}
