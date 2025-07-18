import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class right_click {


    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url
        driver.get("https://practice.expandtesting.com/context-menu/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement right = driver.findElement(By.id("hot-spot"));
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        action.contextClick(right).perform();
        Alert alert = driver.switchTo().alert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        alert.accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));







        driver.quit();

        //

    }

}
