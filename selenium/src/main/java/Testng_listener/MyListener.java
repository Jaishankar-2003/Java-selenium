package Testng_listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
    public void onStart(ITestContext context)
    {
        System.out.println("This is on start Test execution is start ");
    }
    public void onTestStart(ITestResult context)
    {
        System.out.println("multiple execution before start every test case");
    }
    public void onTestSuccess(ITestResult context)
    {
        System.out.println("Test pass");
    }
    public void onTestFailure(ITestResult context)
    {
        System.out.println("Test fail");
    }
    public void onTestSkipped(ITestResult context)
    {
        System.out.println("Test skipped");
    }
    public void onFinish(ITestContext context)
    {
        System.out.println("Test execution is completed - onFinish");
    }
}
