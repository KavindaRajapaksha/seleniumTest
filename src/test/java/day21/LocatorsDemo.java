package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize(); //maximum window

        //name as locator
//        driver.findElement(By.name("search")).sendKeys("Mac");
        //id as locator
//           boolean logoDisplayStatus= driver.findElement(By.id("logo")).isDisplayed();
//           System.out.println(logoDisplayStatus);
        //linktext as locator
//        driver.findElement(By.linkText("Desktops")).click(); //only use this
        //partial link text
//        driver.findElement(By.partialLinkText("Table")).click(); //not complete link should add
// capture the header elements using class name
//        List<WebElement>headerLinks=driver.findElements(By.className("list-inline-item"));
//        System.out.println(headerLinks.size());
        //number of li elements
//        List<WebElement> linkElements=driver.findElements(By.tagName("a"));
//        System.out.println(linkElements.size());
        //number of img
        List<WebElement> numberOfImages=driver.findElements(By.tagName("img"));
        System.out.println(numberOfImages.size()) ;


    }
}
