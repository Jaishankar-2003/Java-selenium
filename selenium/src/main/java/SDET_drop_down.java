import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;


public class SDET_drop_down
{
    public static void main (String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        /*
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

        // SELECT OPTION FOR FIND ELEMENT IN HTML
        Select countrys = new Select(country);

        // sELECT BY VISIBLE TEXT
        //countrys.selectByVisibleText("Germany");

        // SELECT BY VALUE
        countrys.selectByValue("france");

        // SELECT BY INDEX
        countrys.selectByIndex(3);

        // CAPTURE ALL OPTION FROM THE DROPDOWN
        List<WebElement> option = countrys.getOptions();
        System.out.println("number of option : " + option.size());

        // PRINT THE OPTIONS
        for(int i = 0 ; i < option.size(); i++)
        {
            System.out.println(option.get(i).getText());
        }

        // enhance for loop

        System.out.println("------ enhance loop method ------");

        for(WebElement op : option)
        {
            System.out.println(op.getText());
        }

        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");

        driver.findElement(By.xpath("//button[@id='menu1']")).click();

         */

        /*
        // SELECT MULTIPLE OPTION

        FOR(webelement op : options)
        {
            String option = op.getText();
            if( options.equals("java") ||  options.equals("python") ||  options.equals("mysql"))
               {
                    op.click();

               }
        }
         */


        // SELECT HIDDEN DROPDOWN

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();

        driver.quit();
    }
}
