package Testng_listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_shopperstack
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));

        driver.get("https://shoppersstack.com/");
        driver.manage().window().maximize();

        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='home']//img[@alt='logo']")));


        WebElement loginbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='loginBtn']")));
        loginbtn.click();




        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("jaishankarpcservices2021@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jai123@");

        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();

       // driver.quit();

    }


}
