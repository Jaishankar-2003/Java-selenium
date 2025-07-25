import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;


public class find_elements {

    public static void main(String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url

        //driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();

        // if we use the FIND ELEMENT "mandatory we want to use the implicite wait in the code structure"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://letcode.in/edit");


        //find elements is used for find the multiple elements in the web page

        List<WebElement> labels = driver.findElements(By.tagName("label"));
        for (WebElement label : labels)
        {
            String text  = label.getText();
            System.out.println(text);
        }


        driver.quit();
    }


}