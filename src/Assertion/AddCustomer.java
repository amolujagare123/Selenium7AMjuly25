package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddCustomer {

    @Test
    public void addCustomerTest1()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cu")).click();

       /* driver.findElement(By.name("name")).sendKeys("Vishal");
        driver.findElement(By.name("address")).sendKeys("xyz pune");
        driver.findElement(By.name("contact1")).sendKeys("7987779");
        driver.findElement(By.name("contact2")).sendKeys("7979779");*/
        driver.findElement(By.name("Submit")).click();

        String expected = "Please enter a Customer Name".toUpperCase();
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }

    @Test
    public void addCustomerTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cu")).click();

       /* driver.findElement(By.name("name")).sendKeys("Vishal");
        driver.findElement(By.name("address")).sendKeys("xyz pune");
        driver.findElement(By.name("contact1")).sendKeys("7987779");
        driver.findElement(By.name("contact2")).sendKeys("7979779");*/

        driver.findElement(By.name("contact1")).sendKeys("79");
        driver.findElement(By.name("contact2")).sendKeys("79");
        driver.findElement(By.name("Submit")).click();

        String expected1 = "Please enter a Customer Name".toUpperCase();
        String expected2 = "Please enter at least 3 characters.".toUpperCase();
        String expected3 = "Please enter at least 3 characters.".toUpperCase();

        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);

        ArrayList<String> actual = new ArrayList<>();
        try {
           /* String actual1 = driver.findElement(By.xpath("//label[@for='name']")).getText();
            String actual2 = driver.findElement(By.xpath("//label[@for='buyingrate']")).getText();
            String actual3 = driver.findElement(By.xpath("//label[@for='sellingrate']")).getText();

            actual.add(actual1);
            actual.add(actual2);
            actual.add(actual3);*/

            List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));

            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());
            actual.add(wbList.get(2).getText());
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }

    @Test
    public void addCustomerTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cu")).click();

        String name = "Diksha12";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz pune");
        driver.findElement(By.name("contact1")).sendKeys("7987779");
        driver.findElement(By.name("contact2")).sendKeys("7979779");


        driver.findElement(By.name("Submit")).click();

        String expected = "Customer Details Added !";


        String actual = "";
        boolean result = false;

        try {
             actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();


        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        result = actual.contains(expected);
      Assert.assertTrue(result,"incorrect or no success message");
    }

    @Test
    public void addCustomerTest4()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cu")).click();

        String name = "Diksha12";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz pune");
        driver.findElement(By.name("contact1")).sendKeys("7987779");
        driver.findElement(By.name("contact2")).sendKeys("7979779");


        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";


        String actual = "";


        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }
}
