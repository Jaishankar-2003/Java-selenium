import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;


public class SDET_table
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // 1. find total number of rows in a table   ,, multiple table in the web page
        int staticc = driver.findElements(By.xpath("//div[@class='widget-content']//table[@name='BookTable']//tr")).size();
        System.out.println("size of static table row : " + staticc);

        // single table in the web page
        int rows = driver.findElements(By.tagName("tr")).size();
        System.out.println("size of static table row by tag : " +rows);

        // find total number of columns
        int column = driver.findElements(By.xpath("//div[@class='widget-content']//table[@name='BookTable']//tr//th")).size();
        System.out.println("size of static table column: " +column);

        int colum = driver.findElements(By.tagName("th")).size();
        System.out.println("size of static table column by tag : " +colum);

        // read data from specific row and column
        String sel = driver.findElement(By.xpath("//div[@class='widget-content']//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(sel);

        String sele = driver.findElement(By.xpath("//div[@class='widget-content']//table[@name='BookTable']//tr[5]//td[3]")).getText();
        System.out.println(sele);

        //read all the data from column
        System.out.println("-----All rows and columns-----");
        for (int r = 2 ; r<staticc ; r++)
        {
            for(int c = 1 ; c<column; c++)
            {
                String value = driver.findElement(By.xpath("//div[@class='widget-content']//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.println(value);
            }
        }

        driver.quit();
    }
}