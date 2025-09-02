import org.testng.Assert;
import org.testng.annotations.*;

public class Testng_login
{
    @Test(priority = 1 , groups = {"sanity"})
    public void login_facebook()
    {
        System.out.println("login by fb");
    }
    @Test(priority = 2 , groups = {"sanity"})
    public void login_email()
    {
        System.out.println("login by fb");
    }
    @Test(priority = 3, groups = {"sanity"})
    public void login_twitter()
    {
        System.out.println("login by fb");
    }
}
