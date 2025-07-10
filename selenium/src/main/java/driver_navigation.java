import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver_navigation {
    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
            ChromeDriver driver = new ChromeDriver();
//        //FirefoxDriver driver =
//
//        // load the url
//        //driver.get("https://letcode.in/");
//        //driver.get("https://letcode.in/login/");
//        driver.get("https://letcode.in/edit/");

        // LOCATORS IN SELENIUM

        //click login button
        //driver.findElement(By.linkText("Explore Workspace")).click();

        //enter emain find element by name
        /*driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("mor_2314");
        driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("83r5^_");
        driver.findElement(By.xpath("//button['Login']")).click();
         */

        // HANDLING IN SELENIUM

        //enter the full name
//        driver.findElement(By.id("fullName")).sendKeys("jaishankar");
//
//        //append text and press keyword
//        driver.findElement(By.id("join")).sendKeys("person", Keys.TAB);

        //what inside the text box
//        String Value = driver.findElement(By.id("getMe")).getAttribute("value");
//        System.out.println(Value);
//
//        //clear the text
//        driver.findElement(By.id("clearMe")).clear();
//
//        //confirm edit table in disable
//        boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
//        System.out.println("enabled");
//
//        //confirm text is read only
//        String read = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
//        System.out.println(read);
//
//        Thread.sleep(3000);
//        // browser close
//        driver.quit();


        // DRIVER NAVIGATION

        //go to home and come back to the same page using url
        driver.get("https://letcode.in/button");
        String url = driver.getCurrentUrl();
        System.out.println("button url" + url);

        Thread.sleep(2000);

        driver.findElement(By.id("home")).click();
        String urll = driver.getCurrentUrl();
        System.out.println("home url" + urll);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("button url : "+driver.getCurrentUrl());


        Thread.sleep(2000);
        driver.quit();

    }

}
