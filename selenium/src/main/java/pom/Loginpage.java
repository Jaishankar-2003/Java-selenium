package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class Loginpage
{
    WebDriver driver;


    // constructor
    Loginpage(WebDriver driver)
    {
        this.driver = driver;
    }

    // locator
    By txt_username_loc = By.xpath("//input[@placeholder='Username']");
    By txt_passwrd_loc = By.xpath("//input[@placeholder='Password']");
    By btn_login_loc = By.xpath("//button[normalize-space()='Login']");


    // Action methods
    public void Setusername(String user)
    {
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void Setpasword(String pwd)
    {
        driver.findElement(txt_passwrd_loc).sendKeys(pwd);
    }

    public void Clicklogin()
    {
        driver.findElement(btn_login_loc).click();
    }


}
