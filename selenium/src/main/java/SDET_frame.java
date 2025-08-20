import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SDET_frame
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); // pass frame as web element ,, switch to frame 1
        driver.findElement(By.name("mytext1")).sendKeys("test");


        driver.switchTo().defaultContent(); // go back to home page

        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.name("mytext2")).sendKeys("test");

        driver.switchTo().defaultContent(); // go back to home page

        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.name("mytext3")).sendKeys("test");

        driver.switchTo().frame(0); // switch to inner frame use index

        driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']"));
        checkbox.click();








        driver.quit();
    }

}