package day28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//	  select one specific check box  
//	    driver.findElement(By.xpath("//input[@id='sunday']")).click();
//	    select all the check boxes
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
//	    for(WebElement checkbox :checkboxes ) {
//	    	checkbox.click();
//	    }
//	    select last 3 check boxes
//		for (int i = 0; i < 3; i++) {
//			checkboxes.get(i).click();
//		}
//		Unselect check boxes if there are selected
		for(int i=0;i<checkboxes.size();i++) {
			
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
//		driver.close();

	}

}
