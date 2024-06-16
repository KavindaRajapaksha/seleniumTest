package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com");

        driver.manage().window().maximize();

        String name=driver.findElement(By.xpath("//a[normalize-space()='Apple Cinema 30\"']")).getText();
        System.out.println(name);
        driver.quit();
    }
}
