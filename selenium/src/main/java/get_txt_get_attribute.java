import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class get_txt_get_attribute {

    public static void main(String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url

        //driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();
        driver.get("https://letcode.in/edit");

        WebElement h1 = driver.findElement(By.tagName("h1"));
        String txt = h1.getText();   // get text used to
        System.out.println(txt);

        driver.findElement(By.id("testing")).click();
        WebElement title = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[1]/div/h1"));
        String txtt = title.getText();   // get text used to
        System.out.println(txtt);

        WebElement subtitle = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[1]/div/p"));
        String subt = subtitle.getText();   // get text used to
        System.out.println(subt);



        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));







        driver.quit();
    }


}