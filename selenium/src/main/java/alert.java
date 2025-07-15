import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {
    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver
        //test
        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

            //load the url
//        driver.get("https://letcode.in/");
//        driver.get("https://letcode.in/login/");
        driver.get("https://letcode.in/alert");

        //accept the alert and get the text
        driver.findElement(By.id("accept")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("simple text : " + text);
        alert.accept();

        //confirm alert
        driver.findElement(By.id("confirm")).click();
        Alert alertt = driver.switchTo().alert();
        String textt = alert.getText();
        System.out.println("simple text : " + textt);
        alert.dismiss();

        //prompt alert
        driver.findElement(By.id("prompt")).click();
        //System.out.println(driver.getCurrentUrl());       unhandle exception  , no alert exception
        driver.switchTo().alert();
        alert.sendKeys("selenium training shankar");
        System.out.println(alert.getText());
        alert.accept();
        String name = driver.findElement(By.id("myName")).getText();
        System.out.println(name);



        //Thread.sleep(1000);
        driver.quit();

    }

}
