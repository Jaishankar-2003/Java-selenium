import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*

XPATH
---------

XPATH is an address of element

DOM - document object model

2 types of xpath

Absolute xpath - full xpath - /html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]

            --- supose if dev change something , chg location , keep happens , or remove something , these changes affect the hirerachy


Relative xpath - partial xpath - //div[@id='PageList2']//a[normalize-space()='Home'] -

                ---- it work based on attribute of an element

which xpath is prefer ?
reletive xpath

diff of absolute and releative xpath ?

1 absolute xpath start with /    ----  represent root node
  relative xpath start with //

2 absolute xpath do not attribute
  relative xpath work with attribute

3  absolute  xpath traverse through each node till it finds element
   relative xpath directly jump and find the element by attribute

   Relative xpath

   1 Automatically   (dev tools , selectorhub)
   2 manually own xpath

        Syntax :
            //tagname[@attribute='value']
            //*[@attribute='value']


 */



public class SDET_3_XPATH_1
{
    public static void main(String[] arg) throws InterruptedException
    {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        // Xpath with single attribute
        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("test");

        // Xpath with multiple attribute
        driver.findElement(By.xpath("//input[@id='name'][@placeholder='Enter Name']")).sendKeys("onyum ela");

        // Xpath with 'and' 'or' operators

        // if using [ and ] both the attribute should be true  //input[@name = 'search' and @placeholder = 'search']

        driver.findElement(By.xpath("//input[@id='email' and @placeholder='Enter EMail']"));

        // if using [ or ] any one of the attribute should be true  //input[@name = 'search' and @placeholder = 'search']

        driver.findElement(By.xpath("//input[@id='phone'  or @placeholder='Enter Phone']"));


        // Xpath with inner text - text()

        // if link text can be inner text but all the innner text cannot be a link text

        // a[text()='Desktops']
        // a[text()='Macbook']

        //<a href = "https://xyz.com">
           // linktext = yes
          // inner text = yes

        // <div> welcome </div>
            // link text = no
            //  innertext = yes


        // Xpath with contains ()      ( partial text value )
        driver.findElement(By.xpath("//input[contains(@placeholder,'Name')]")).sendKeys("test");

        // Xpath starts - with ()     begining of the attribute
        driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));


        // handling dynamic attribute

        //*[@id='starts' or @id='stop']
        //*[contains(@id,'st')]
        //*[starts-with(@id,'st')]

        driver.quit();
    }
}
