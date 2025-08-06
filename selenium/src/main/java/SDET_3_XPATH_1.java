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
 */



public class SDET_3_XPATH_1
{
    public static void main(String[] arg) throws InterruptedException
    {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();

    }
}
