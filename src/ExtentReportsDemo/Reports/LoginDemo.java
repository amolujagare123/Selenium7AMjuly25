package ExtentReportsDemo.Reports;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportsDemo.util.ForExtentReports.screenshot;

public class LoginDemo {

   ExtentReports extent;

   @BeforeClass
   public void initExtent()
   {
       ExtentSparkReporter reporter = new ExtentSparkReporter("reports/report.html");
       extent = new ExtentReports();
       extent.attachReporter(reporter);

       reporter.config().setDocumentTitle("Stock Management System");
       reporter.config().setReportName("regression testing");

       extent.setSystemInfo("Developed By","Aniruddha");
       extent.setSystemInfo("Tested By","Purnima");
       extent.setSystemInfo("System Environment","Windows 11 , Chrome");
       extent.setSystemInfo("Environment","Pre-Production");
       extent.setSystemInfo("Project Dead line","22 Sept 2025");
   }

   @AfterClass
   public void writeToReport()
   {
       extent.flush();
   }


    @Test
    public void loginTest1() throws IOException {

        ExtentTest test = extent.createTest("valid login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("Url is opened");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin1");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[value='LOG IN']"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual,expected,"This is not a dashboard");
            test.pass("this test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("this test is failed because :\n"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+ screenshot(driver));

        }


    }

   @Test
    public void loginTest2() throws IOException {

       ExtentTest test = extent.createTest("invalid login");

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://stock.scriptinglogic.in/");

       test.info("Url is opened");

       WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
       txtUsername.sendKeys("admin");

       test.info("username is entered");

       WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
       txtPassword.sendKeys("admin1");

       test.info("password is entered");

       WebElement btnLogin = driver.findElement(By.cssSelector("input[value='LOG IN']"));
       btnLogin.click();

       test.info("login button is clicked");

       String expected = "Wrong Username or Password";
       String actual = "";
       try {
           actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
       }
       catch (Exception e)
       {

       }
       System.out.println("expected="+expected);
       System.out.println("actual="+actual);

       try {
           Assert.assertEquals(actual, expected, "incorrect or no error message");

           test.pass("this test is passed");
       }
       catch (AssertionError e)
       {
           test.fail("this test is failed because :\n"+e.getMessage());

           test.addScreenCaptureFromPath("./screenshots/"+ screenshot(driver));


       }
    }

    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("blank login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("Url is opened");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[value='LOG IN']"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");

            test.pass("this test is passed");
        }
        catch (AssertionError e)
        {
            test.fail("this test is failed because :\n"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+ screenshot(driver));

        }
    }
}
