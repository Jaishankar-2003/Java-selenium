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
    @Test(dataProvider = "dp")
    void testlogin(String username , String pwd) throws InterruptedException
    {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
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
    @DataProvider(name = "dp" , indices = {4})
    Object[][] loginData()       // data provider method always return two dimentional array (object , string , int , boolean)
    {
        Object data[][] = {
                            {"abc@gmail.com","test123"},
                            {"xyz@gmail.com","test023"},
                            {"john@gmail.com","test@123"},
                            {"johnkenedy@gmail.com","test"},
                            {"jaishankar98421@gmail.com","Test12345"}
                           };
        return data;
    }

}
