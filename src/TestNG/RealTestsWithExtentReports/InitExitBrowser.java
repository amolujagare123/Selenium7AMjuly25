package TestNG.RealTestsWithExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class InitExitBrowser {

    public static WebDriver driver;

    @BeforeSuite
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }

    public static WebDriver getDriver()
    {
        return  driver;
    }
}
