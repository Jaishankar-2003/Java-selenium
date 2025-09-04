import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Testng_parameter
{
    WebDriver driver;
    @BeforeTest
    @Parameters({"browser","url"})
    public void login(String br,String url) throws InterruptedException
    {
        switch (br.toLowerCase())
        {
            case "chrome" : driver = new ChromeDriver(); break;
            //case "edge" : driver = new EdgeDriver(); break;
            case "firefox" : driver = new FirefoxDriver(); break;
            default:System.out.println("invalid browser");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void logo() throws InterruptedException
    {
        Thread.sleep(1000);
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status,true);
    }
    @Test(priority = 2)
    public void title()
    {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
}
