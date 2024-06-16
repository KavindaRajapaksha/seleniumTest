package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main (String[] args){
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //xpath with single attribute
//        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Apple");
        //xpath with multiple attribute
//         driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Apple");
        //xpath with operator
//        driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Kavinda");
//        driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("Kavinda");
        //xpath with text text()-inner text
//        driver.findElement(By.xpath("//*[text()='Desktop']")).click();
//    boolean displayLogo=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//        System.out.println(displayLogo);

//   String title=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
//        System.out.println(title);
        //xpath with contains method
//        driver.findElement(By.xpath(" ")).sendKeys("Kavinda");

    }
}
