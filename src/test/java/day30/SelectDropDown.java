package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	   WebElement country=	driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry =new Select(country);
		
//		drpCountry.selectByVisibleText("France");
//		drpCountry.selectByValue("india");
		drpCountry.selectByIndex(3);
		
		List<WebElement> options=drpCountry.getOptions();
		
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		//select option from the dropdown
		
		
		
	}

}
