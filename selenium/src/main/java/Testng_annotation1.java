import org.checkerframework.checker.tainting.qual.Tainted;
import org.testng.annotations.*;

/*

1 login ----> @BeforeMethod
2 Search ----> @Test
3 Logout ----> @AfterMethod
4 Login
5 Adv Search ----> @Test
6 Logout

 */
public class Testng_annotation1
{
    @BeforeClass
    void login() {
        System.out.println("login");
    }
    @AfterClass
    void logout()
    {
        System.out.println("logout");
    }
    @Test(priority = 1)
    void search()
    {
        System.out.println("Search");
    }
    @Test(priority = 2)
    void advSearch()
    {
        System.out.println("adv search");
    }

}

