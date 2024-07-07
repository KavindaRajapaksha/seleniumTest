package day28;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		driver.switchTo().alert().accept();
//		Alert myAlert=driver.switchTo().alert();
//		myAlert.accept();
		
		
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Alert conAlert=driver.switchTo().alert();
//		
//		conAlert.dismiss();
////		conAlert.accept();
//		prompt alert
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click()
//;
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Alert myPrompt=driver.switchTo().alert();
//		myPrompt.sendKeys("ok");
//		myPrompt.accept();
//		
		
		
		
		driver.close();
		
		
		

	}

}
