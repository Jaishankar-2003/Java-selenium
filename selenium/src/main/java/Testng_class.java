import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Testng_class
{
    @Test
    public void search()
    {
        System.out.println("search the app");
    }
    @Test
    public void advsearch()
    {
        System.out.println("advance search");
    }
    @BeforeClass
    public void login()
    {
        System.out.println("login the app");
    }
    @AfterClass
    public void logout()
    {
        System.out.println("logout the app");
    }
    @BeforeTest
    public void biglogin()
    {
        System.out.println("b.test login the app");
    }
    @AfterTest
    public void biglogout()
    {
        System.out.println("a.test login the app");
    }
}
