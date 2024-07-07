package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		
		driver.switchTo().frame(frame1);//as a webelement
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Kavinda");
		
		driver.switchTo().defaultContent();//goback
		
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Rajapaksha");
		
		driver.switchTo().defaultContent();
		
		
		
		driver.switchTo().frame(frame3);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
		
		
		
		
		

	}

}
