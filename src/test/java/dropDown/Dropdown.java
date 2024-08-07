package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdown {
    FirefoxDriver driver;
    @BeforeTest
    public void OpenUrl()
    {
        driver = new FirefoxDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
    }
    @Test
    public void selectFromDropdown()
    {
        Select menu = new Select(driver.findElement(By.id("dropdown")));
        Assert.assertFalse(menu.isMultiple());
        Assert.assertEquals(3, menu.getOptions().size());
        System.out.println(menu.getFirstSelectedOption().getText());
        
    }

    @AfterTest
    public void afterTesting()
    {
        driver.quit();
    }

}
