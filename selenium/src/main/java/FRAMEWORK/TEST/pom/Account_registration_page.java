package FRAMEWORK.TEST.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_registration_page extends Basepage
{
    public Account_registration_page(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Create Account']")  WebElement create_account_btn;

    @FindBy(xpath = "//input[@id='First Name']") WebElement create_firstname;

    @FindBy(xpath = "//input[@id='Last Name']") WebElement create_lastname;

    @FindBy(xpath = "//input[@id='Male']") WebElement male_btn;

    @FindBy(xpath = "//input[@id='Phone Number']") WebElement phone;

    @FindBy(xpath = "//input[@id='Email Address']") WebElement email;

    @FindBy(xpath = "//input[@id='Password']") WebElement password;

    @FindBy(xpath = "//input[@id='Confirm Password']") WebElement confirm_pass;

    @FindBy(xpath = "//input[@id='Terms and Conditions']") WebElement term_condition;

    @FindBy(xpath = "//button[@id='btnDisabled']") WebElement register_btn;




    public void Create_account_btn()
    {
        create_account_btn.click();
    }
    public void malebtn()
    {
        male_btn.click();
    }
    public void term_condition()
    {
        term_condition.click();
    }
    public void register_btn()
    {
        register_btn.click();
    }

    public void Create_firstname(String user)
    {
        create_firstname.sendKeys(user);
    }
    public void Create_lastname(String user)
    {
        create_lastname.sendKeys(user);
    }
    public void Phone(String user)
    {
        phone.sendKeys(user);
    }
    public void Email(String user)
    {
        email.sendKeys(user);
    }
    public void Password(String user)
    {
        password.sendKeys(user);
    }
    public void Confirm_pass(String user)
    {
        confirm_pass.sendKeys(user);
    }

}
