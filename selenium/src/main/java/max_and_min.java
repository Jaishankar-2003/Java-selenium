import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class max_and_min {
    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        //load the url
//        driver.get("https://letcode.in/");
//        driver.get("https://letcode.in/login/");


        WebDriver.Options opt = driver.manage();
        WebDriver.Window win = opt.window();
        win.maximize();

        driver.manage().window().minimize();
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.get("https://letcode.in/");








        //Thread.sleep(1000);
        driver.quit();

    }

}
