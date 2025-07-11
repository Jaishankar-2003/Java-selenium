import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Load URL
        driver.get("https://letcode.in/button");

        // Take Screenshot
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //File src = driver.getScreenshotAs((OutputType.FILE));
        File dest = new File("/home/sri-jaya-shankaran/IdeaProjects/java-selenium/selenium/src/main/snaps/image1.png");
        // Copy the screenshot to destination
        FileHandler.copy(src, dest); // ✅ works only with correct Selenium FileHandler

        //take pic of paricular button (element)

        WebElement ele = driver.findElement(By.id("home"));
        File srcc = ele.getScreenshotAs(OutputType.FILE);
        File destt = new File("/home/sri-jaya-shankaran/IdeaProjects/java-selenium/selenium/src/main/snaps/image2.png");
        // Copy the screenshot to destination
        FileHandler.copy(srcc, destt); // ✅ works only with correct Selenium


        //SCREENSHOT OF THE ENTIRE SECTION

        WebElement sec = driver.findElement(By.className("content"));
        File srccc = sec.getScreenshotAs(OutputType.FILE);
        File desttt = new File("/home/sri-jaya-shankaran/IdeaProjects/java-selenium/selenium/src/main/snaps/image3.png");
        // Copy the screenshot to destination
        FileHandler.copy(srccc, desttt); // ✅ works only with correct Selenium


        // Close browser
        driver.quit();
    }
}
