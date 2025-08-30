import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.List;

public class SDET_ddt_login
{
   public static void main(String[] args) throws IOException, InterruptedException {
       WebDriver driver = new ChromeDriver();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();

       driver.get("https://practicetestautomation.com/practice-test-login/");

       String filepath = "/home/sri-jaya-shankaran/IdeaProjects/java-selenium/selenium/src/main/testdata/ddt.xlsx";
       System.out.println("Excel Path: " + filepath);


       int row = SDET_excel_util.getRowCount(filepath,"sheet1");

       for(int i = 1 ; i<=row ; i++)
       {
           // 1 read data from excel
           String user = SDET_excel_util.getcelldata(filepath,"sheet1",i,0);
           String pass = SDET_excel_util.getcelldata(filepath,"sheet1",i,1);
           String expect = SDET_excel_util.getcelldata(filepath,"sheet1",i,2);

           // 2 pass above data into app
           driver.findElement(By.xpath("//input[@id='username']")).clear();
           driver.findElement(By.xpath("//input[@id='password']")).clear();
           driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
           driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);

           driver.findElement(By.xpath("//button[@id='submit']")).click();

           Thread.sleep(500);


            // 3 validation

           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
           String actual = "";

           try {
               // wait for either logout button or error message
               wait.until(ExpectedConditions.or(
                       ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Log out']")),
                       ExpectedConditions.visibilityOfElementLocated(By.id("error"))
               ));

               // if logout exists → login success
               List<WebElement> logout = driver.findElements(By.xpath("//a[normalize-space()='Log out']"));
               if (!logout.isEmpty() && logout.get(0).isDisplayed()) {
                   actual = "pass";
                   logout.get(0).click();  // logout for next iteration
               }
               else
               {
                   // login failed → error message
                   WebElement error = driver.findElement(By.id("error"));
                   String errmsg = error.getText();
                   actual = errmsg.contains("invalid") ? "fail" : "fail";
               }

           } catch (TimeoutException e) {
               // if neither appeared → fail
               actual = "fail";
           }

// write result based on comparison with expected
           String result = actual.equalsIgnoreCase(expect) ? "pass" : "fail";
           SDET_excel_util.setCellData(filepath, "sheet1", i, 3, result);
       }

       driver.quit();
   }


}
