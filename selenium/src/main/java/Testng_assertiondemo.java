import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.internal.Utils;

public class Testng_assertiondemo
{
    @Test
    void testtitle()
    {
        String exp = "test";
        String act = "test";
        if(exp.equals(act))
        {
            System.out.println("test pass");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("test failed");
            Assert.assertTrue(false);
        }
        //Assert.assertEquals(exp,act);
    }
}
