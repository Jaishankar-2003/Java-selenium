import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   // chrome driver is an class
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

// import org.openqa.selenium these is an main source

public class SDET_1_locator
{
    public static  void main (String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement check  = driver.findElement(By.xpath("//*[@id=\"RInW4\"]/div/label/input"));
        check.click();


        driver.findElement(By.name("search")).sendKeys("new day today");

        driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();

        driver.quit();
    }
}
