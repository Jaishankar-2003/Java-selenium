import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;


public class SDET_svg {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//*[name()='circle' and contains(@cx,'15')]"));

        if(logo.isDisplayed() == true)
        {
            System.out.println("circle display");
        }
        else
        {
            System.out.println("not display");
        }

        WebElement logo1 = driver.findElement(By.xpath("//div[@class='svg-container']//*[name()='rect']"));

        if(logo1.isDisplayed() == true)
        {
            System.out.println("rectangle display");
        }
        else
        {
            System.out.println("not display");
        }

        driver.quit();

    }
}