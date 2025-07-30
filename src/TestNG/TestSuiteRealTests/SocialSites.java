package TestNG.TestSuiteRealTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {


    WebDriver driver;

    @BeforeClass // this method will run before first test method of the class
    public  void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterClass //  this method will run  after last test method of the class
    public  void closeBrowser()
    {
        driver.quit();
    }

    @Test (/*enabled = false*/ priority = 3)
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test  (priority = 2)
    public void twitter() {
        driver.get("https://www.twitter.com");
    }

    @Test(priority = 1)
    public void linkedin() {
        driver.get("https://www.linkedin.com");
    }

    @Test (priority = 1)
    public void instagram() {
        driver.get("https://www.instagram.com");
    }
}
