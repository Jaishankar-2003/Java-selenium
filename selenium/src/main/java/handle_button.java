import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_button {
    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =
//
//        load the url
//        driver.get("https://letcode.in/");
//        driver.get("https://letcode.in/login/");
        driver.get("https://letcode.in/button");

        //Find x and y coordinates

        Point val = driver.findElement(By.id("position")).getLocation();
        System.out.print(val);

        Thread.sleep(2000);
        driver.quit();

    }

}
