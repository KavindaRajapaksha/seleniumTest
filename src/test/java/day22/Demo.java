package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.uk/");

        String title=driver.getTitle();
        System.out.println(title.equals("Google"));
        driver.quit();


    }
}
