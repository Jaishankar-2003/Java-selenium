import org.testng.Assert;
import org.testng.annotations.*;

public class Testng_signup
{
    @Test(priority = 1 , groups = {"regression"})
    public void signup_fb()
    {
        System.out.println("signup by fb");
    }
    @Test(priority = 2 , groups = {"regression"})
    public void signup_twitter()
    {
        System.out.println("signup by twitter");
    }
    @Test(priority = 3 , groups = {"regression"})
    public void signup_mail()
    {
        System.out.println("signup by mail");
    }
}
