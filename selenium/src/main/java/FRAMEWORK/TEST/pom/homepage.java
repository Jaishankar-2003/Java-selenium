package FRAMEWORK.TEST.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends Basepage
{
    public homepage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@id='loginBtn']")  WebElement login_button;


//---------------------------------- LOGIN PAGE -----------------------------------------

    @FindBy(xpath = "//input[@id='Email']") WebElement login_email;
    @FindBy(xpath = "//input[@id='Password']") WebElement login_pass;


    public void setLogin_button()
    {
        login_button.click();
    }

    //    login buttons

    public void login_email()
    {
        login_email.click();
    }
    public void login_pass()
    {
        login_pass.click();
    }

}
