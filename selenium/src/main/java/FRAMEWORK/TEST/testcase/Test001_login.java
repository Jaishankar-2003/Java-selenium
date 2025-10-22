package FRAMEWORK.TEST.testcase;

import FRAMEWORK.TEST.testbase.Baseclass;
import FRAMEWORK.TEST.pom.homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import FRAMEWORK.TEST.pom.Account_registration_page;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test001_login extends Baseclass
{

    @Test(groups = "regression")
    public void Account_register() throws InterruptedException
    {
        logger.info("***Starting T.c 001***");

        try
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40)); // heavy wait 30 sec

            homepage hp = new homepage(driver);
            // Wait for the login button to be clickable before clicking


            logger.info("LOGO DISPLAYED");
            WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='home']//img[@alt='logo']")));


            logger.info("CLICK LOGIN BUTTON");

            //WebElement login = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='loginBtn']")));
            //login.click();

            WebElement login = driver.findElement(By.xpath("//button[@id='loginBtn']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", login);

            logger.info("FILL ALL THE DETAILS");

            Account_registration_page ap = new Account_registration_page(driver);

            ap.Create_account_btn();
            ap.Create_firstname("Test");
            ap.Create_lastname("Test");
            ap.malebtn();
            ap.Phone(randomnumber());
            ap.Email(randommail() + "@gmail.com");
            Thread.sleep(500);
            String pwd = randomnumber() + "AB" + "ab" + "@";
            ap.Password(pwd);
            ap.Confirm_pass(pwd);
            ap.term_condition();
            ap.register_btn();

            logger.info("ACT  CREATE SUCCESSFULLY");


            Thread.sleep(2000);

        }
        catch (Exception e)
        {
            logger.error("Test failed...");
            logger.debug("Debug logs...");
            Assert.fail();
        }
        logger.info("*******  finish  Tc 001 *******");


    }
}
