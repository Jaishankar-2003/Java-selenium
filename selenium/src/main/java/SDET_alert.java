import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;    // web driver is an interface
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class SDET_alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // normal alert ( driver.switchTo().alert().accept() )
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Alert alert = driver.switchTo().alert();
        String exp = "I am an alert box!";
        System.out.println(" expected " + exp);
        String expp = alert.getText();
        System.out.println(" Actual " + alert.getText());
        if(exp.equals(expp))
        {
            System.out.println("condition pass");
        }
        else
        {
            System.out.println("condition fail");
        }
        alert.accept();








        driver.quit();

    }
}