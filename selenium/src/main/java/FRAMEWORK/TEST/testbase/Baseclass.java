package FRAMEWORK.TEST.testbase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
//import java.util.logging.LogManager;
//import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static java.util.logging.LogManager.getLogManager;

//import org.apache.logging.log4j.core.Logger;

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
