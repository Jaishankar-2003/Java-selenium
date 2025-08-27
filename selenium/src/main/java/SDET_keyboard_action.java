import org.openqa.selenium.*;
import org.openqa.selenium.devtools.CdpVersionFinder;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;


public class SDET_keyboard_action
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://platform.text.com/tools/diff-checker");
        driver.findElement(By.xpath("/html/body/main/section[2]/div/div[2]/div[1]/div/div[1]/div/div/textarea")).sendKeys("Test");

        Actions act = new Actions(driver);

        //ctrl A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //ctrl C
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // TAB
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        Thread.sleep(500);

        //ctrl V
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();


        driver.quit();
    }
}