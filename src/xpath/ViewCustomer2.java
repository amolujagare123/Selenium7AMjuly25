package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ViewCustomer2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.linkText("View Customers")).click();

        List<WebElement> wbList = driver.findElements(By.xpath("//a[contains(@class,'edit')]"));


       // for (WebElement element:wbList)
            for (int i=0;i< wbList.size();i++)
            {
             wbList.get(i).click();
               Thread.sleep(4000);
             driver.navigate().back();
        }

    }
}
