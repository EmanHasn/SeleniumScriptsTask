package isElementPresent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
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
    @Test
    public void ApplyIsPresent()
    {
        if(CheckElePresent(By.xpath("//*[@id=\"checkboxes\"]/input[1]"))){
            WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
            if(!checkBox1.isSelected())
            {
                checkBox1.click();
            }
        }
        else {
            System.out.println("i don't find that element");
        }
    }
    @AfterTest
    public void AfterTesting()
    {
        driver.quit();
    }


}
