import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;



import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SDET_wait
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //declaration

        //get(url)
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

        WebElement usertxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))); // use the declaration
        usertxt.sendKeys("Admin");

        WebElement passuser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        passuser.sendKeys("Admin123");

        WebElement visible = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        System.out.println("login is visible "+ visible.isEnabled());
        driver.quit();
    }
}