import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class SDET_navigate
{
    public static void main (String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.navigate().to("https://www.automationexercise.com/");
        //driver.navigate().to("https://www.saucedemo.com/");

        driver.get("https://www.tutorialspoint.com/");
        driver.findElement(By.xpath("//ul[@class='flex-group accent-nav__right-list']//li[6]//a[1]//*[name()='svg']")).click();

//        driver.navigate().back();
//
//        System.out.println(driver.getCurrentUrl());[;
//        System.out.println(driver.getWindowHandle());
//        driver.navigate().forward();
//
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getWindowHandle());
//        driver.navigate().refresh();

        Set<String> windowids = driver.getWindowHandles();

        //approch1
        List<String> windowList=new ArrayList<>(windowids);

        if(windowList.size() > 1)
        {
            String parentid = windowList.get(0);
            String childid = windowList.get(1);

            //switch to child window
            driver.switchTo().window(childid);
            System.out.println(driver.getTitle());

            //switch to parent window
            driver.switchTo().window(parentid);
            System.out.println(driver.getTitle());
        }
        else
        {
            System.out.println("only one win will shown");
        }


        driver.quit();
    }
}
