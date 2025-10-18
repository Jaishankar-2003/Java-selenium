package FRAMEWORK.TEST.testbase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.events.EventFiringDecorator;


// common class all commonly used elements will be here

public class Baseclass
{

    public WebDriver driver;

    // Log4j
    public Logger logger;

    @BeforeClass
    public void setup()
    {
        //log4j2
        logger = LogManager.getLogger(this.getClass());
        logger.trace("Logger initialized at TRACE level");




        // Create raw ChromeDriver
        ChromeDriver rawDriver = new ChromeDriver();

        // Create custom listener for logging intermediate steps
        WebDriverListener listener = new WebDriverListener() {

            @Override
            public void beforeClick(WebElement element) {
                logger.trace("Before clicking: " + elementDescription(element));
            }

            @Override
            public void afterClick(WebElement element) {
                logger.trace("Clicked: " + elementDescription(element));
            }


            public void beforeFindElement(WebDriver driver, By by) {
                logger.trace("Finding element: " + by.toString());
            }

            @Override
            public void afterFindElement(WebDriver driver, By by, WebElement element) {
                logger.trace("Found element: " + by.toString());
            }

            public void beforeChangeValueOf(WebElement element, CharSequence[] keysToSend) {
                logger.trace("Before typing in: " + elementDescription(element) + " Keys: " + String.join("", keysToSend));
            }

            public void afterChangeValueOf(WebElement element, CharSequence[] keysToSend) {
                logger.trace("Typed in: " + elementDescription(element));
            }

            private String elementDescription(WebElement element) {
                try {
                    return element.getTagName() + "@" + element.getAttribute("id");
                } catch (Exception e) {
                    return element.toString();
                }
            }
        };

        // Decorate driver with event listener
        driver = new EventFiringDecorator(listener).decorate(rawDriver);





        driver  = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://shoppersstack.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void terminate()
    {
        driver.quit();
    }

    public  String randommail()
    {
        String  generatedstring = RandomStringUtils.randomAlphabetic(8);
        return  generatedstring;

    }
    public  String randomnumber()
    {
        String  generatedstring = RandomStringUtils.randomNumeric(10);
        return  generatedstring;
    }
    public  String randompass()
    {
        String  generatednumber = RandomStringUtils.randomAlphanumeric(8);
        return  generatednumber;
    }
}
