package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

public class navigationDemo {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        driver.get("https://demo.opencart.com/");
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

//        URL myUrl=new URL("https://demo.nopcommerce.com/");
//        driver.navigate().to(myUrl);

//        driver.navigate().back();
//        driver.navigate().to("https://www.google.co.uk/");
//
//
//        driver.navigate().back();
//        System.out.println("first URL " +driver.getCurrentUrl());
//
//
//        driver.navigate().forward();
//        System.out.println("Second URL "+driver.getCurrentUrl()   );


        driver.findElement(By.xpath("//a[normalize-space()='Apple MacBook Pro 13-inch']")).click();
        System.out.println("Mac URL: "+driver.getCurrentUrl());
        String name= driver.getTitle();

        String wind=  driver.getWindowHandle();
        System.out.println(name);
        System.out.println(wind);
        driver.navigate().back();
        String win2=driver.getWindowHandle();
        System.out.println(win2);
        System.out.println(driver.getTitle()  );
        driver.navigate().forward();





        driver.close();




    }
}
