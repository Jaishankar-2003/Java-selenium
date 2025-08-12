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

public class SDET_4_method
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().window().maximize();

        //get(url)
        driver.get("https://www.orangehrm.com/");

        //getTitle()
        System.out.println("Title "  + driver.getTitle());

        //getcurrent url
        System.out.println("Current url " + driver.getCurrentUrl());

        //getpage source ----->  it gives the source code its not much use
        //System.out.println(driver.getPageSource());

        //getwindowhandle     not same id every time
        System.out.println("win id " + driver.getWindowHandle());

        //get win handles



        // isDisplayed
        WebElement logo = driver.findElement(By.xpath("//img[@src='/public/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
        System.out.println("logo is displayed : " + logo.isDisplayed());

        //isEnable()
        WebElement search = driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
        System.out.println("search is enable :  " + search.isEnabled());



        Set<String> solu = driver.getWindowHandles();
        System.out.println("All Window IDs: " + solu);

        driver.quit();
    }
}