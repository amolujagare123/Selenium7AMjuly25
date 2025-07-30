package TestNG.TestSuiteRealTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void openai() {
        driver.get("https://www.openai.com");
    }

    @Test
    public void huggingface() {
        driver.get("https://www.huggingface.co");
    }

    @Test
    public void stabilityAI() {
        driver.get("https://www.stability.ai");
    }

    @Test
    public void perplexity() {
        driver.get("https://www.perplexity.ai");
    }
}