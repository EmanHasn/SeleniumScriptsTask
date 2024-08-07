package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search {
    FirefoxDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.amazon.eg/?&tag=egtxabkgode-21&ref=pd_sl_9nl3hxlh2f_e&adgrpid=154141460560&hvpone=&hvptwo=&hvadid=666886350653&hvpos=&hvnetw=g&hvrand=5594215714543173574&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1005398&hvtargid=kwd-298964289059&hydadcr=23156_2215277&language=en_AE");
    }
    @Test
    public void search()
    {
        WebElement searchBtn = driver.findElement(By.id("twotabsearchtextbox"));
        searchBtn.clear();
        searchBtn.sendKeys("مكرونة");
        searchBtn.submit();
    }
    @AfterTest
    public void afterTest()
    {
       driver.quit();
    }

}
