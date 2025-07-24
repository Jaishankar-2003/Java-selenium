import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_dis_is_enable_is_select {

    public static void main(String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url

        //driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();
        driver.get("https://letcode.in/test");


        // isDisplay() - used to check if the element is visible or rendered
        boolean login = driver.findElement(By.linkText("Click")).isDisplayed();
        System.out.println("The element is displayed : " + login);


        // isEnable - if the element is intractable   ,, (if the elements is intractable or not )

        driver.get("https://letcode.in/edit");
        WebElement noedit = driver.findElement(By.id("noEdit"));
        boolean edit = noedit.isEnabled();
        System.out.println("the noedit is enable or not (no edit btn)  : " + edit);
        System.out.println("no edit eneble or not (no edit btn) :" + noedit.isEnabled());

        driver.navigate().back();

        driver.findElement(By.linkText("Click")).click();

        boolean enable = driver.findElement(By.id("isDisabled")).isEnabled();
        System.out.println("If the button is disable or not(disable btn) :" + enable);

        driver.navigate().back();

        driver.findElement(By.linkText("Toggle")).click();

        // isSelected - if the element is already selected - radio , check box

        WebElement remember = driver.findElement(By.xpath("/html/body/app-root/app-radio/section/div/div/div[1]/div/div/div[6]/label[2]/input"));
        System.out.println( "If the element is display or not (remember btn) :" + remember.isSelected());



        driver.quit();
    }


}