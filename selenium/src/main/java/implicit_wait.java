import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class implicit_wait {
    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url
        //driver.get("https://letcode.in/");
        driver.get("https://letcode.in/login/");
        //driver.get("https://letcode.in/edit/");

        // LOCATORS IN SELENIUM



        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   //1 time declaration

        driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("mor_2314");
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("83r5^_");
        driver.findElement(By.xpath("/html/body/app-root/app-login/section/div/div[1]/div[2]/div/button")).click();



        driver.quit();

        //

    }

}
