package Testng_listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.time.Duration;

//@Listeners(Testng_listener.MyListener.class)

public class listener_orange
{
    WebDriver driver;
    @Test(priority = 1)
    void openapp() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("-------------");
        System.out.println("open app start");
        System.out.println("---------------");
    }
    @Test(priority = 2)
    void testlogo() throws InterruptedException
    {

        Boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println(logo);
        Thread.sleep(1000);
        System.out.println("---------------");
        System.out.println("test log done");
        System.out.println("---------------");
    }
    @Test(priority = 3)
    void url() throws InterruptedException
    {
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        System.out.println("---------------");
        System.out.println("test url done");
        System.out.println("---------------");
    }
    @Test(priority = 4)
    void testlogin() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        System.out.println("---------------");
        System.out.println("test login done");
        System.out.println("---------------");
    }
    @Test(priority = 5)
    void testlogout()
    {
        System.out.println("---------------");
        System.out.println("test logout done");
        System.out.println("---------------");
        driver.quit();
    }
}
