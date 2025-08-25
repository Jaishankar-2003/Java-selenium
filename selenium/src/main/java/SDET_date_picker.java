import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ElementClickInterceptedException;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;


public class SDET_date_picker
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");

        // switch to the inner frame

        driver.switchTo().frame(0);

        // click the date picker it open calender
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        // METHOD 1 : using sendkeys()
       // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");


        // METHOD 2 using date picker element
        String targetYear = "2025";
        String targetMonth = "December";
        String date = "20";

        while (true)
        {
            String month = driver.findElement(By.className("ui-datepicker-month")).getText();
            String year  = driver.findElement(By.className("ui-datepicker-year")).getText();

            System.out.println(month);
            System.out.println(year);

            if (month.equals(targetMonth) && year.equals(targetYear))
            {
                break; // we are on the right month/year
            }
            else
            {
                driver.findElement(By.xpath("//a[@title='Next']")).click(); // go to next month
                // [for fucture month click next] and [ for previous months click previous button]

        }
            // method 1 Get directly
        driver.findElement(By.xpath("//a[text()='"+date+"']")).click();

        /*
        // method 2  select date  by use list
        List <WebElement> alldates = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));

        for(WebElement dt : alldates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }

        }
         */




        driver.quit();


    }
}
