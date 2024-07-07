package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
      driver.manage().window().maximize();
      //login
      driver.findElement(By.name("username")).sendKeys("Admin");
      driver.findElement(By.name("password")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
      
      //clicking on pim
      driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
      
	}

}
