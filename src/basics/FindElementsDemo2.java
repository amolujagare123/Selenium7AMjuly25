package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> wbList = driver.findElements(By.tagName("a"));
        System.out.println("total elements = "+wbList.size());


    /*    for(int i=1 ; i< wbList.size()-1; i++)
        {
            System.out.println(wbList.get(i).getText());
        }

        */

        for(WebElement element:wbList)
        {
            if(!element.equals(wbList.get(wbList.size()-1))  && !element.getText().equals("") )
               System.out.println(element.getText());
        }


    }
}
