import org.testng.Assert;
import org.testng.annotations.Test;

/*
    open app
    login
    logout
 */

public class Testng_first
{
    @Test(priority = 1)
   void openapp()
    {
        System.out.println("open app");
    }

    @Test(priority = 0)
    void login()
    {
        System.out.println("log app");
    }

    // @Test(priority = -1)
    void logout()
    {
        System.out.println("logout app");
    }

}
