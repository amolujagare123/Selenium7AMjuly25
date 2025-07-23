package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");

        driver.navigate().to("http://faccebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(4000);

        driver.navigate().refresh();

    }
}
