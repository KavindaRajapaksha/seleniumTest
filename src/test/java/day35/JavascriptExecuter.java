package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
//		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kavinda");
		 WebElement ipBox=driver.findElement(By.xpath("//input[@id='name']"));
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
//		 JavascriptExecutor js=driver;
		 
		 js.executeScript("arguments[0].setAttribute('value','Kavinda')", ipBox);
		 
		 WebElement rdButton=driver.findElement(By.xpath("//input[@id='male']"));
		 
		 js.executeScript("arguments[0].click()", rdButton);
		 
		  
		 
		 
		  
		 

	}

}
