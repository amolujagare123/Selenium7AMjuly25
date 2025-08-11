package TestNG.RealTestsWithExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AISites extends InitExitBrowser {



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