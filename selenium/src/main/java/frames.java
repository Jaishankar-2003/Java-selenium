import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();



//        driver.get("https://letcode.in/");
//        driver.get("https://letcode.in/login/");
        driver.get("https://letcode.in/frame");

        //PARENT FRAME
        //driver.switchTo().frame(0);
        WebElement frame = driver.findElement(By.xpath("//iframe[@src= 'frameui']"));
        driver.switchTo().frame(frame);
        //driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("test");//no such element exception
        String value = driver.findElement(By.name("fname")).getText();
        System.out.println(value);

        driver.findElement(By.name("lname")).sendKeys("test");

        //INNER FRAME
        WebElement framee = driver.findElement(By.xpath("//iframe[@src= 'innerframe']"));
        driver.switchTo().frame(framee);
        driver.findElement(By.name("email")).sendKeys("test");

        //BACK TO PARENT FRAME
        // mainframe --> f1 --> f2
        //if f2 -->f1 --> switch to parent ()
        //if f2 --> mainframe --> default conent

        driver.switchTo().parentFrame();
        driver.findElement(By.name("lname")).sendKeys("test to back");

        // back to default
        driver.switchTo().defaultContent();
        // watch tutorial dive
        driver.findElement(By.xpath("/html/body/app-root/app-frame/section/div/div/div[2]/app-learning-point/div/footer/button")).click();


        driver.quit();

        // driver.switchTo().frame().switchTo().frame();      directly move to inner frame





        //Thread.sleep(1000);
        driver.quit();

    }

}
