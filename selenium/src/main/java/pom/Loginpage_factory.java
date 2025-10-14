package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_factory
{
    WebDriver driver;

    // constructor
    Loginpage_factory(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this); //mandatory
    }

    // locator
    // By txt_username_loc = By.xpath("//input[@placeholder='Username']");
    // By txt_passwrd_loc = By.xpath("//input[@placeholder='Password']");
    // By btn_login_loc = By.xpath("//button[normalize-space()='Login']");


    @FindBy(xpath="//input[@placeholder='Username']")  WebElement txt_username;
    @FindBy(xpath="//input[@placeholder='Password']")  WebElement txt_passwrd;
    @FindBy(xpath="//button[normalize-space()='Login']")  WebElement btn_login;


    // Action methods
    public void Setusername(String user)
    {
        txt_username.sendKeys(user);
    }

    public void Setpasword(String pwd)
    {
        txt_passwrd.sendKeys(pwd);
    }

    public void Clicklogin()
    {
        btn_login.click();
    }


}
