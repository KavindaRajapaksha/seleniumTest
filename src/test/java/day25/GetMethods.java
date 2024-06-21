package day25;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
         String title=driver.getTitle();
        System.out.println(title );
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle() );
    }
}
