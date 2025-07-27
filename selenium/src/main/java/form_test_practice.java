import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class form_test_practice
{
    public static void main (String[] args ) throws InterruptedException
    {
        ChromeDriver driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://letcode.in/forms");



    }

}
