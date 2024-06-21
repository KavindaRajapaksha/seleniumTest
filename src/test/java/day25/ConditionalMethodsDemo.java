package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsDemo {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

//        Boolean title=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//        System.out.println(title);
//        Boolean check= driver.findElement(By.xpath("//label[normalize-space()='Newsletter:']")).isEnabled();
//        System.out.println(check);
        Boolean check2=driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
        System.out.println(check2);

        driver.quit();


    }

}
