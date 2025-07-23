package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvoicePlaneDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.invoiceplane.com/");

        driver.findElement(By.id("email")).sendKeys("admin@invoiceplane.com");
        driver.findElement(By.id("password")).sendKeys("demopassword");
        driver.findElement(By.xpath("//button")).click();

        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();


        driver.findElement(By.xpath("//tr[td/a[text()='Abc']]//div")).click();


        driver.findElement(By.xpath("//tr[td/a[text()='Abc']]//li[2]")).click();

        // Another way of xpath for edit option

        //tr[td/a[text()='Abc']]//a[contains(@href,'form')]
        //tr[td/a[text()='Abc']]//i[contains(@class,'edit')]



    }
}
