package FRAMEWORK.TEST.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Basepage
{
    public WebDriver driver;
    public WebDriverWait wait;

    public Basepage(WebDriver Driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // heavy wait
    }

}
