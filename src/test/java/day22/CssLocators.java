package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Apple");
//        driver.findElement(By.linkText("Search")).click();
//        driver.findElement(By.cssSelector(" #small-searchterms")).sendKeys("Apple");
//           driver.findElement(By.cssSelector("button.button-1")).click();
//
//        driver.findElement(By.cssSelector(".search-box-text[placeholder=\"Search store\"]")).sendKeys("Apple");

    }

}
