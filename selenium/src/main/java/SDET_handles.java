import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SDET_handles
{
    public static void main(String[] args) throws IOException
    {
        //ChromeOptions option = new ChromeOptions();
        //option.addArguments("--incognito");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();  // add ChromeOption in current web driver

        // Load URL
        //driver.get("https://expired.badssl.com/");

        driver.get("https://text-compare.com");


        System.out.println(driver.getTitle());  // privacy error

        driver.quit();
    }
}
