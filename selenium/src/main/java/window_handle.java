import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class window_handle
{
    public static void main (String[] args ) throws InterruptedException
    {
        ChromeDriver driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("im going to txt");

        driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();


        String winhandle = driver.getWindowHandle();  // IT GIVES THE PARENT ELEMENT ON THE WINDOW
        System.out.println("window handle : " + winhandle);
        System.out.println("window handle : " + driver.getCurrentUrl());


        /*Set <String> winhandles =  driver.getWindowHandles();   // it gives all the element details  ( put the elements in set)

        System.out.println("window handles :" + winhandles);

        System.out.println(driver.getCurrentUrl());*/

        List <String> winhandles  = new ArrayList<>(driver.getWindowHandles()); // get the element from the set values
        System.out.println("handles " + winhandles);

        if ( winhandles.size() > 1 )
        {
          driver.switchTo().window(winhandles.get(1));
          driver.manage().window().maximize();
          System.out.println("handles: " + driver.getCurrentUrl());
        }
        else
        {
            System.out.println("no new windows should be found");
        }

        driver.switchTo().window(winhandles.get(0));
        driver.close();

        Set <String> winhandles2 =  driver.getWindowHandles();
        winhandles.clear();
        winhandles.addAll(winhandles2);
        driver.switchTo().window(winhandles.get(0));



        System.out.println("final url " + driver.getCurrentUrl());








        //driver.switchTo().window(list.get(1));
        //System.out.println(driver.getCurrentUrl());








        //driver.quit();

    }

}
