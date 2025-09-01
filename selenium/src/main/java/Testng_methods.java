import org.testng.annotations.*;

public class Testng_methods
{
    @Test
    public void test1()
    {
        System.out.println("test case 1");
    }
    @BeforeMethod
    public void before()
    {
        System.out.println("before method test");
    }
    @AfterMethod
    public void after()
    {
        System.out.println("after method test");
    }
    @Test
    public void test2()
    {
        System.out.println(" test case 2");
    }
}
