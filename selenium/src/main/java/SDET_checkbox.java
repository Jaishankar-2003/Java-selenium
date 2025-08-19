import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class SDET_checkbox
{
    public static void main (String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        /*
        // select specfic element
        WebElement fri = driver.findElement(By.xpath("//input[@id='friday']"));
        fri.click();
        WebElement satur = driver.findElement(By.xpath("//input[@id='saturday']"));
        satur.click();
        System.out.println("fri is selected  :" + fri.isSelected());
        System.out.println("satur is selected  :" + satur.isSelected());


        //select all element
        List<WebElement> check = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(int i = 0 ; i <= check.size() ; i++)
        {
            check.get(i).click();
        }


        // by enhanced loop method recommended
        List<WebElement> check = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(WebElement checkbox : check)
        {
            checkbox.click();
        }


        // select last 3 checkbox    int i = 4 ; i <= check.size() ; i++
        // total no of checkbox - how many checkbox want to select = starting index
        List<WebElement> check = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(int i = 0 ; i<= 3 ; i++ )
        {
            check.get(i).click();
        }
         */

        // unselect checkbox if they are selected
        List<WebElement> check = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(int i = 0 ; i < 4 ; i++ )
        {
            check.get(i).click();
        }

        Thread.sleep(5000);

        for(int i = 0 ; i < 3 ; i++ )
        {
            if(check.get(i).isSelected())
            {
                check.get(i).click();
            }


        }

        driver.quit();
    }
}
