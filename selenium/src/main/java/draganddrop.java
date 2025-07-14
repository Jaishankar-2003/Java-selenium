import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class draganddrop {


    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   //1 time declaration
        driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        action.dragAndDrop(source,target).perform();
        System.out.println(action.getActionDuration());


        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   //1 time declaration
        driver.switchTo().frame(0);
        WebElement sourcee = driver.findElement(By.id("draggable"));
        //WebElement targett = driver.findElement(By.id("droppable"));

        Thread.sleep(1000);
        Actions actionn = new Actions(driver);
        actionn.dragAndDropBy(sourcee,30,40).perform();



        //actionn.dragAndDrop(source,target).perform();
        //System.out.println(action.getActionDuration());



        // Thread.sleep(1000);



        driver.quit();

        //

    }

}
