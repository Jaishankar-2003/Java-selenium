import org.testng.Assert;
import org.testng.annotations.*;

public class Testng_payment
{
    @Test(priority = 1, groups = {"sanity","regression","functional"})
    public void pay_inr()
    {
        System.out.println("pay inr");
    }
    @Test(priority = 2 , groups = {"sanity","regression","functional"})
    public void pay_dollar()
    {
        System.out.println("pay dollar");
    }

}
