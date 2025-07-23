package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElementsDemo3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/searchresults.html?ss=Goa&ssne=Goa&ssne_untouched=Goa&efdco=1&aid=355028&lang=en-us&sb=1&src_elem=sb&src=index&dest_id=4127&dest_type=region&checkin=2025-08-01&checkout=2025-08-03&group_adults=2&no_rooms=1&group_children=0");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        List<WebElement> wbList = driver.findElements(By.xpath("//div[@data-testid='title']"));
        System.out.println("total elements = "+wbList.size());


        for(WebElement element:wbList)
        {
             System.out.println(element.getText());
        }


    }
}
