package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Assignment {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");

        List<WebElement> numberOfImages=driver.findElements(By.tagName("img"));
        System.out.println("number of images :"+numberOfImages.size());

        List<WebElement> numberOfLinks=driver.findElements(By.tagName("a"));
        System.out.println("number of links :"+numberOfLinks.size());

        driver.findElement(By.linkText("About us")).click();
    }
}
