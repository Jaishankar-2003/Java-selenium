import java.util.NoSuchElementException;
import java.util.Scanner;

public class exception_handle
{
    public static void main (String[] args)
    {
        System.out.println("test the exception");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try
        {
            int a = num % 0;
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.err.println("error exception" + e);
        }
        finally
        {
            sc.close();
        }
//        catch (ArithmeticException exception)
//        {
//            System.out.println(exception);
//        }

        System.out.println("complete");
    }

    public void code() throws InterruptedException, NoSuchElementException
    {

    }
}
