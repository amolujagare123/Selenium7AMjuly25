package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        // 1. find the element
       WebElement multiSelectText = driver.findElement(By.id("multiSel"));

       // 2. create the object of Select class
        Select selText = new Select(multiSelectText);

        // 3. select the option
        Thread.sleep(4000);

        selText.selectByVisibleText("text 2");
        selText.selectByIndex(2);
        selText.selectByIndex(3);

        Thread.sleep(4000);

        /*selText.deselectByIndex(2);
        selText.deselectByIndex(3);*/

        selText.deselectAll();





    }
}
