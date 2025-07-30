
// CSS SELECTOR

// WHY CSS -  COMBINE ID & TAG WE USE CSS   ( IN EVERY LOCATOR WE CANT PREDICT THE ELEMENT )

/*  tag is optional

CSS SELECTOR

tag id    -     tag#id    tag of element , id of element ( # )

tag class    --    tag.classname ( . )          locate group of element  as well single element

tag attribute   -    tag[attribute="value"]

tag class attribute -   tag.classname[attribute = "value"]    locate ( single element specific element )

*/






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   // chrome driver is an class
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

// import org.openqa.selenium these is an main source

public class SDET_2_LOCATOR_CSS
{
    public static  void main (String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        // Tag # Id   (tag name is optional )
        driver.findElement(By.cssSelector("input#name")).sendKeys("test");

        System.out.println(driver.findElements(By.cssSelector("input.form-control")));

        // Tag.classname

        driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("test");

        // Tag[attribute = "value"]

        driver.findElement(By.cssSelector("input[placeholder = 'Enter EMail']")).sendKeys("test");

        // Tag.classname[attribute="value"]

        driver.findElement(By.cssSelector("input.form-control[id = 'phone']")).sendKeys("123");




        driver.quit();
    }
}
