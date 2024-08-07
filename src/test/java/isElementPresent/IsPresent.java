package isElementPresent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class IsPresent {
    ChromeDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
    }
    @Test
    public boolean CheckElePresent(By PassEl)
    {
        try
        {
            driver.findElement(PassEl);
            System.out.println("present");
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
    }


}
