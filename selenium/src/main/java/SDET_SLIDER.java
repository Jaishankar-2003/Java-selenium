import org.openqa.selenium.By;
import org.openqa.selenium.devtools.CdpVersionFinder;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;


public class SDET_SLIDER
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        Actions act = new Actions(driver);

        WebElement left = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        System.out.println("left : " + left.getLocation());
        act.dragAndDropBy(left,40,0).perform();
        Thread.sleep(500);
        System.out.println("left after : " + left.getLocation());


        WebElement right = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        System.out.println("right :" + right.getLocation());
        act.dragAndDropBy(right,30,0).perform();
        System.out.println("right after : " + right.getLocation());



        driver.quit();
    }
}