import org.openqa.selenium.*;
import org.openqa.selenium.devtools.CdpVersionFinder;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptException;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;


public class SDET_javascript_executor
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        /*
        WebElement input = driver.findElement(By.xpath("//input[@id='name']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;   // if use these kind of type cast


        // Alternate of send keys method  // if normal send key function is not work properly we can use executeScript
        js.executeScript("arguments[0].setAttribute('value','john')",input); // argument[0] pre defined array used to store data we give

        //js.executeScript("arguments[0].value='john';", input);


        // alternate of click()
        WebElement btn = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()",btn);

         */

        JavascriptExecutor js=(JavascriptExecutor) driver;   // if use these kind of type cast


       // 1 scroll page by pixel number
        js.executeScript("window.scrollBy(0,250)","");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        // 2 scroll page till the element is visible in page;
        WebElement visi = driver.findElement(By.xpath("//h2[normalize-space()='Scrolling DropDown']"));
        js.executeScript("arguments[0].scrollIntoView();",visi);
        System.out.println(js.executeScript("return window.pageYOffset;"));

        // 3 scroll page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        // 4 Scroll back to the initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        //js.executeScript("document.body.style.zoom='50%'"); // set zoom level


        //driver.manage().window().minimize();


        // single file uploaded
        driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("/home/sri-jaya-shankaran/Documents/driver.txt");

        if(driver.findElement(By.xpath("//input[@id='singleFileInput']")).getText().equals("driver.txt"))
        {
          System.out.println("succs");
        }
        else
        {
            System.out.println("fail");
        }

        driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();


        // MULTIPLE FILE UPLOAD

        String file1 = "/home/sri-jaya-shankaran/Documents/driver.txt";
        String file2 = "/home/sri-jaya-shankaran/Documents/temp of report.txt";

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='multipleFilesInput']")).sendKeys(file1+"\n"+file2);
        driver.findElement(By.xpath("//button[normalize-space()='Upload Multiple Files']")).click();



        driver.quit();
    }
}