package Testng_listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportmgr implements ITestListener
{
    public ExtentSparkReporter sparkReporter; // ui of the report
    public ExtentReports extent; // populate common info on the report
    public ExtentTest test; // creating test case entries in the report and update status of the test methods


    public void onStart (ITestContext context)
    {
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/testdata/extend report/report1.html");

        sparkReporter.config().setDocumentTitle("Automation report");
        sparkReporter.config().setReportName("Function test");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("computer name " , "localhost");
        extent.setSystemInfo("Environment" , "QA");
        extent.setSystemInfo("Test Name" , "Jai");
        extent.setSystemInfo("OS" , "Windows10");
        extent.setSystemInfo("Browser name" , "Chrome");
    }

    public void onTestSuccess(ITestResult result)
    {
        test = extent.createTest(result.getName());
        test.log(Status.PASS,"Test case PASSED is :" + result.getName());
        test.log(Status.FAIL,"Test case FAILED cause :" + result.getThrowable());
    }

    public void onTestFailure(ITestResult result)
    {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL,"Test case FAILED is :" + result.getName());
        test.log(Status.FAIL,"Test case FAILED cause :" + result.getThrowable());
    }

    public void onTestSkipped(ITestResult result)
    {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP,"Test case Skipped is :" + result.getName());
    }

    public void onFinish(ITestResult result)
    {
        extent.flush();
    }

}
