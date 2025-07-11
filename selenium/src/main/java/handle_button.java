import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_button {
    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =
//
//        load the url
//        driver.get("https://letcode.in/");
//        driver.get("https://letcode.in/login/");
        driver.get("https://letcode.in/button");

        //Find x and y coordinates
        Point val = driver.findElement(By.id("position")).getLocation();   //point give the location
        System.out.println(val);

        //find the colour of the button
        WebElement clr = driver.findElement(By.id("color"));
        String clrr = clr.getCssValue("background-color");    //getCssvalue
        System.out.println(clrr);
        System.out.println(clr.getAttribute("color"));
        System.out.println(clrr.getClass());

        //find the height an width of the button
        Rectangle rect = driver.findElement(By.id("property")).getRect();
        System.out.println("------------------");
        System.out.println(rect.getDimension());
        System.out.println("-----------------");
        Dimension dim = rect.getDimension();
        System.out.println(rect);
        System.out.println(dim);
        System.out.println(dim.getHeight());
        System.out.println(dim.getWidth());
        System.out.println(dim.getClass());

        // confirm button enable or disable
        WebElement element = driver.findElement(By.id("isDisabled"));
        boolean ele = element.isEnabled();
        System.out.println("isEnabled : " + ele);

        boolean isDisplayed = element.isDisplayed();
        System.out.println("Is displayed: " + isDisplayed);

        //Thread.sleep(1000);
        driver.quit();

    }

}
