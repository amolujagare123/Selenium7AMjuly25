package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/flight/search?itinerary=PNQ-AMD-24/07/2025&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&lang=eng");


        String flightNumber="6E 819";
        driver.findElement(By.xpath("//div[ contains(@class,'appendBottom5') ][div//p[text()='"+flightNumber+"']]//span[text()='VIEW PRICES']")).click();




    }
}
