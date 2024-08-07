package FromloginToHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestCases {
    FirefoxDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new FirefoxDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @Test
    public void enterData()
    {
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        username.clear();
        username.sendKeys("tomsmith");
        password.clear();
        password.sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        WebElement Hometxt = driver.findElement(By.id("flash"));
        System.out.println(Hometxt.getText());
        Assert.assertTrue(Hometxt.getText().contains("You logged"));
        driver.manage().window().fullscreen();
    }
    @Test
    public void logout()
    {
        driver.findElement(By.className("icon-signout")).click();
        System.out.println("Logout");
    }

    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }



}
