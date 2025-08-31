import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_test1 
{
    @Test
    public void testOne() 
    {
        System.out.println("Test One Running...");
        Assert.assertTrue(true);
    }

    @Test
    public void testTwo()
    {
        System.out.println("Test Two Running...");
        Assert.assertEquals("Hello", "Hello");
    }
}
