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

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();


       WebElement txt = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
       //System.out.println(txt.getText());


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       driver.findElement(By.className("wikipedia-search-button")).click();



        driver.quit();
    }
}
