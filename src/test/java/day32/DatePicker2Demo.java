package day32;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2Demo {
	
	
	//user define method
	static Month convertMonth(String month) {
		HashMap<String,Month> monthMap=new HashMap<String,Month>();
		
		monthMap.put("January",Month.JANUARY);
		monthMap.put("February",Month.FEBRUARY);
		monthMap.put("March",Month.MARCH);		
		monthMap.put("April",Month.APRIL);
		monthMap.put("May",Month.MAY);
		monthMap.put("June",Month.JUNE);
		monthMap.put("July",Month.JULY);
		monthMap.put("August",Month.AUGUST);
		monthMap.put("September",Month.SEPTEMBER);
		monthMap.put("October",Month.OCTOBER);
		monthMap.put("November",Month.NOVEMBER);
		monthMap.put("December",Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		if(vmonth==null) {
			System.out.println("Invalid Input");
		}
	   return vmonth;
	
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//inputs		
		String requiredYear="2021";
		String requiredMonth="June";
		String requiredDate="29";
		
	
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		
		//Select year
		WebElement yearDropdown=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear=new Select(yearDropdown);
		selectYear.selectByVisibleText(requiredYear);
		
//		select Month
//		while(true) {
//			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			String year=driver.findElement(By.xpath("//a[@title='Prev']")).getText();
//			if(month.equals(requiredMonth) && year.equals(requiredYear)) {
//				break;
//				
//			}
//			driver.findElement(By.xpath("//a[@title='Prev']")).click();
//		}
		
		
//		driver.close();
    
		
//		select month
    
		while(true) {
			//Display month
			String displayMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			//convert required month & display months into the objects
			Month expecteMonth= convertMonth(requiredMonth);
			Month currentMonth= convertMonth(displayMonth);
			
			//compare
			int result=  expecteMonth.compareTo(currentMonth);
			
			//0 month are equal
			//>0 future month
			//0< past month
			if(result<0) {
				//past month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}else if(result>0){
				//future month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
			}else {
				break;
			}
			//date picker
	      List<WebElement> allDates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
			
			for(WebElement dt : allDates) {
				if(dt.getText().equals(requiredDate)) {
					dt.click();
					break;
				}
			}
 			
			
			Thread.sleep(5000);
			
			driver.close();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
