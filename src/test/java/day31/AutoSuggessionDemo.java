package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggessionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println(ele.size());
		
//		for(int i=0;i<ele.size();i++) {
//			System.out.println(ele.get(i).getText());
//		}
//		for(int i=0;i<ele.size();i++) {
//			if(ele.get(i)==1) {
//				ele.get(i).click();
//			}
//		}
//		ele.get(1).click();
		
		for(int i=0;i<ele.size();i++) {
			if(ele.get(i).getText().equals("selenium")) {
				ele.get(i).click();
				break;
			}
		}
		
		
		
//		driver.close();

	}

}
