package ExtentReportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReports {

    public static String screenshot(WebDriver driver) throws IOException {

        // 1. create the object reference of TakesScreenshot
        // assign this to current driver & type cast driver to
        // TakesScreenshot

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts
        // (object reference of TakesScreenshot)

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());

        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("reports/screenshots/"+fileName));

        return fileName;
    }

    public static ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("regression testing");

        extent.setSystemInfo("Developed By","Aniruddha");
        extent.setSystemInfo("Tested By","Purnima");
        extent.setSystemInfo("System Environment","Windows 11 , Chrome");
        extent.setSystemInfo("Environment","Pre-Production");
        extent.setSystemInfo("Project Dead line","22 Sept 2025");

        return extent;
    }
}
