import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SDET_headless
{
    public static void main(String[] args) throws IOException
    {

        ChromeOptions option = new ChromeOptions();

        option.addArguments("--headless=new");  // setting for headless mode of execution

        // Launch Chrome
        WebDriver driver = new ChromeDriver(option);  // add ChromeOption in current web driver

        // Load URL
        driver.get("https://letcode.in/button");
        String titl = driver.getTitle();
        System.out.println(titl);

        if(titl.equals("Buttons | LetCode with Koushik"))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }


        driver.quit();
    }
}