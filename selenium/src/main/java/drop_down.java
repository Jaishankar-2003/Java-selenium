import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class drop_down {


    public static void main (String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url
        //driver.get("https://practice.expandtesting.com/dropdown");
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //to scroll the page to perform operation
      /*WebElement element = driver.findElement(By.id("dropdown")); // use any locator
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);


        driver.findElement(By.id("dropdown"));
        WebElement drop = driver.findElement(By.cssSelector("#dropdown"));
        Select dropdown = new Select(drop);                 // USE SELECT FOR THE DROP DOWN
        dropdown.selectByVisibleText("Option 1");
        dropdown.selectByVisibleText("Option 2");

        WebElement country = driver.findElement(By.id("country"));
        Select mycountry = new Select(country);
        mycountry.selectByValue("IN");
        WebElement selectedCountry = mycountry.getFirstSelectedOption();
        System.out.println(selectedCountry.getText());

        Select myCountry = new Select(driver.findElement(By.id("country")));
        myCountry.selectByValue("IN");
        System.out.println(myCountry.getFirstSelectedOption().getText());
        */

        Select apple = new Select(driver.findElement(By.id("fruits")));
        System.out.println("Is multiple select? " + apple.isMultiple());

        apple.selectByValue("0");
        apple.selectByValue("1");
        apple.selectByValue("2");
        apple.selectByValue("3");


        List<WebElement> fruitt = apple.getOptions();  //syntax list of HTML elements that were selected from the dropdown.
        fruitt.forEach(i -> System.out.println(i.getText()));


        System.out.println(apple.getFirstSelectedOption().getText());





        Select heros = new Select(driver.findElement(By.id("superheros")));
        boolean multi  = heros.isMultiple();
        System.out.println("is multi: " + heros.isMultiple());

        Select fruit = new Select(driver.findElement(By.id("fruits")));
        fruit.selectByVisibleText("Apple");
        System.out.println(fruit);



        heros.selectByValue("am");//it return any thing just select the option
        heros.selectByIndex(2);
        heros.selectByIndex(3);
        heros.selectByIndex(4);
        System.out.println("Selected: " + heros.getFirstSelectedOption().getText());

        //DESELECT THE ELEMENT is only possible by multi drop down
        heros.deselectByIndex(3);


       List<WebElement> SelectedOptions = heros.getAllSelectedOptions();  //syntax list of HTML elements that were selected from the dropdown.
        System.out.println(" All selected options:");
        for (WebElement option : SelectedOptions) {      // loop function for the given system
            System.out.println("- " + option.getText());
        }

        /*
        In a multi-select dropdown, multiple options can be selected at once. But sometimes:
        You wanna reset the dropdown before selecting new options
        You need to remove a specific choice
        You’re testing form validations that depend on selected/unselected states
        If you don't deselect first, your test could accidentally keep previous selections, causing wrong results or flaky behavior.
        */










        driver.quit();

        //

    }

}
