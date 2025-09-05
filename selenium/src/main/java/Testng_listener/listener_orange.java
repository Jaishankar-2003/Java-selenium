package Testng_listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class listener_orange
{
    WebDriver driver;
    @Test(priority = 1)
    void openapp()
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 2, dependsOnMethods = {"url"})
    void testlogo() throws InterruptedException
    {
        Thread.sleep(3000);
        Boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println(logo);
    }
    @Test(priority = 3)
    void url()
    {
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 3)
    void testlogin()
    {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(" Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
    @Test(priority = 4)
    void testlogout()
    {
        driver.quit();
    }
}
