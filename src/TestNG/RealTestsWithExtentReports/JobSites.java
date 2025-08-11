package TestNG.RealTestsWithExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends InitExitBrowser {



    @Test
    public void naukri() {
        driver.get("https://www.naukri.com");
        Assert.assertEquals(driver.getTitle(),
                "naukri site",
                "This is not a valid website");
    }

    @Test
    public void monster() {
        driver.get("https://www.monsterindia.com");
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com");
    }

    @Test
    public void glassdoor() {
        driver.get("https://www.glassdoor.com");
    }
}