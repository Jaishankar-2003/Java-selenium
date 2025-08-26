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


public class SDET_mouse_action
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // mouse hover to pointme
        WebElement point = driver.findElement(By.xpath("//button[@class='dropbtn']"));
        WebElement mobilep = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));

        Actions act = new Actions(driver);

        act.moveToElement(point).moveToElement(mobilep).click().build().perform();

        // get field 1  and field 2 xpath
        WebElement fiel1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement fiel2 = driver.findElement(By.xpath("//input[@id='field2']"));

        // clear the text field
        fiel1.clear();

        // send some text to that fiels
        fiel1.sendKeys("test");

        // get copy button xpath
        WebElement copy = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        // perform the double click
        act.doubleClick(copy).perform();



        //String fiel = fiel2.getText(); // gettext() only copy the inner text of the element
        String fiel = fiel2.getAttribute("value");
        System.out.println(fiel);


        if(fiel.equals("test"))
        {
            System.out.println("text copied");
        }
        else
        {
            System.out.println("text not copied");
        }

        // get element for drag and drop the box
        WebElement box1 = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement box2 = driver.findElement(By.xpath("//div[@id='droppable']"));

        // perform the drag and drop operation
        act.dragAndDrop(box1,box2).perform();

        Thread.sleep(1000);

        driver.quit();

    }
}
