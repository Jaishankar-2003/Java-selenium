import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class explit_wait
{
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();

//        driver.get("https://letcode.in/waits");
//        driver.findElement(By.id("accept")).click();
//        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
//        Alert until = wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(until.getText());
//        until.accept();

        //Thread.sleep(3000);
        //driver.switchTo().alert().accept();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
        WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
//        Actions ebuilder = new Actions(driver);
//        ebuilder.moveToElement(ele).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(hoverElement));
        new Actions(driver).moveToElement(ele).perform();
        WebElement apple = driver.findElement(By.linkText("Apple"));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) apple));
        apple.click();

        System.out.println(driver.getTitle());



        driver.quit();


    }

}
