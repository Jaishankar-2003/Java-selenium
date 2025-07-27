import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        driver.get("https://letcode.in/waits");
        driver.findElement(By.id("accept")).click();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
        Alert until = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(until.getText());
        until.accept();

        //Thread.sleep(3000);
        //driver.switchTo().alert().accept();

        driver.quit();


    }

}
