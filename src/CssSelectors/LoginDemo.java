package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("input[value='LOG IN']"));
        btnLogin.click();

        driver.findElement(By.cssSelector("a[href='add_customer.php']")).click();

        driver.findElement(By.cssSelector("#name")).sendKeys("Vishal");
        driver.findElement(By.cssSelector("textarea[name='address']")).sendKeys("xyz pune");
        driver.findElement(By.cssSelector("#buyingrate")).sendKeys("7987779");
        driver.findElement(By.cssSelector("#sellingrate")).sendKeys("7979779");
        driver.findElement(By.cssSelector("input[value='Add']")).click();
    }
}
