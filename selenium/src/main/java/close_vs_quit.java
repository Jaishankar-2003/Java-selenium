import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class close_vs_quit {

    public static void main(String[] arg) throws InterruptedException {

        // To open the chrome using simple driver

        //System.setProperty("webdriver.chrome.driver" , " location of the driver ")
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver =

        // load the url

        //driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();
        driver.get("https://letcode.in/edit");

        WebElement h1 = driver.findElement(By.tagName("h1"));
        String txt = h1.getText();   // get text used to
        System.out.println(txt);

        driver.findElement(By.id("testing")).click();
        WebElement title = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[1]/div/h1"));
        String txtt = title.getText();   // get text used to
        System.out.println(txtt);

        WebElement subtitle = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[1]/div/p"));
        String subt = subtitle.getText();   // get text used to
        System.out.println(subt);

        driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[1]/a[1]")).click();

        WebElement letcode = driver.findElement(By.xpath("/html/body/app-root/app-main/section[1]/div/div/h1"));
        String subtt = letcode.getText();
        System.out.println(subtt);

        driver.navigate().back();

        driver.findElement(By.linkText("Edit")).click();

        String card = driver.findElement(By.className("card-content")).getText();
        System.out.println("---------------");

        System.out.println(card);

        System.out.println("----------------");


        // GET ATTRIBUTE ()

        String cardd = driver.findElement(By.id("fullName")).getAttribute("placeholder");
        String join = driver.findElement(By.id("join")).getAttribute("value");
        String getme = driver.findElement(By.id("getMe")).getAttribute("value");
        String clearme = driver.findElement(By.id("clearMe")).getAttribute("value");
        String noEdit = driver.findElement(By.id("noEdit")).getAttribute("placeholder");
        String dontwrite = driver.findElement(By.id("dontwrite")).getAttribute("value");

        System.out.println("-----attribute-----");

        System.out.println("---------------");

        System.out.println(cardd);
        System.out.println(join);
        System.out.println(getme);
        System.out.println(clearme);
        System.out.println(noEdit);
        System.out.println(dontwrite);

        System.out.println("----------------");



        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.close();  // if i use close it will close but not goes from memory  (it will run on task manage)

        driver.quit();
    }


}