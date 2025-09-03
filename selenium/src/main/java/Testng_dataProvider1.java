import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Testng_dataProvider1
{
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    void testlogin() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jaishankar98421@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Test12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        boolean status = driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
        if(status == true)
        {
            WebElement el = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();",el); // important condition
            Assert.assertTrue(true);
        }
        else
        {
            Assert.fail();
        }
    }
    void teardown()
    {

    }

}
