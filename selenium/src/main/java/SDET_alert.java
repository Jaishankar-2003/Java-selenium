import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SDET_alert {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait declare

        /*
        // normal alert ( driver.switchTo().alert().accept() )
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Alert alert = driver.switchTo().alert();
        String exp = "I am an alert box!";
        System.out.println(" expected " + exp);
        String expp = alert.getText();
        System.out.println(" Actual " + alert.getText());
        if(exp.equals(expp))
        {
            System.out.println("condition pass");
        }
        else
        {
            System.out.println("condition fail");
        }
        alert.accept();



        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("onum ela");
        System.out.println(alert1.getText());
        alert1.accept();

         */

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert alert = mywait.until(ExpectedConditions.alertIsPresent());


        //Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth ");  // authentication popup




        driver.quit();

    }
}