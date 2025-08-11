package ListenersDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExtentReports.initExtentReport;
import static ExtentReportsDemo.util.ForExtentReports.screenshot;
import static TestNG.RealTestsWithExtentReports.InitExitBrowser.getDriver;

public class MyExtentListeners implements ITestListener {


    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("this test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.fail("this test is failed because :\n"+result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+ screenshot(getDriver()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.skip("this test is skipped because :\n");
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if(extent==null)
          extent = initExtentReport();
    }

   public void onFinish(ITestContext context) {
         System.out.println("onFinish");

       extent.flush();
    }
}
