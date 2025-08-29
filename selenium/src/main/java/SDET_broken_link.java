import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.net.UrlChecker;
import java.net.URL;
import java.net.HttpURLConnection;


import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.List;

public class SDET_broken_link {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");

        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for(WebElement linkele : links)
        {
            String hrefv = linkele.getAttribute("href");

            if(hrefv==null || hrefv.isEmpty())
            {
                System.out.println("not possible");
                continue;
            }

         try
         {
             // hit url to the server

             URL linkURL = new URL(hrefv);
             HttpURLConnection connlink = (HttpURLConnection) linkURL.openConnection(); // open connection to the server
             connlink.connect(); //connect to server and sent request the server

             if (connlink.getResponseCode() >= 400)
             {
                 System.out.println(hrefv + "broken");
             }
             else
             {
                 System.out.println(hrefv + "not");
             }

         }
         catch (Exception e)
         {
         }

        }





        driver.quit();

    }
}