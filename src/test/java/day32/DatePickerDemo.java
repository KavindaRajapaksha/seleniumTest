package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	static void selectFutureMonthAndYear(WebDriver driver,String Wmonth,String Wyear) {
		
		
		while(true) {
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(year.equals(Wyear) && month.equals(Wmonth)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
			
			
			
		
	
		
		
		}
	}
	
	
	
	
	static void selectPastMonthAndYear(WebDriver driver,String Wmonth,String Wyear) {
		
		
		while(true) {
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(year.equals(Wyear) && month.equals(Wmonth)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//next
			
			
			
		
	
		
		
		}
	}
	
	
		
	static void selectDate(WebDriver driver,String Wdate) {
		List<WebElement> allDates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			
			for(WebElement dt : allDates) {
				if(dt.getText().equals(Wdate)) {
					dt.click();
					break;
				}
			}
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//switch the frame
		driver.switchTo().frame(0);
		
		//using sendKeys
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/08/2024");
		
		//using date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		selectFutureMonthAndYear(driver,"May","2025");
		selectDate(driver,"18");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectPastMonthAndYear(driver,"May","1999");
		selectDate(driver,"18");
		
//		//select  month and year
//		while(true) {
//			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//			
//			if(year.equals(Wyear) && month.equals(Wmonth)) {
//				break;
//			}
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
//			
//			
//			
//		
//	
//		
//		
//		}
		//select the date
//		List<WebElement> allDates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
//		
//		for(WebElement dt : allDates) {
//			if(dt.getText().equals(Wdate)) {
//				dt.click();
//				break;
//			}
//		}
		
		Thread.sleep(8000);
		
		driver.close();
		
		

	}

}
