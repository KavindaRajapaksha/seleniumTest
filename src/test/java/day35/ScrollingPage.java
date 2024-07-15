package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		 
		//scroll by page pixel number
//		js.executeScript("window.scrollBy(0,3000)", "");
//		System.out.println(js.executeScript("return window.pageYOffset"));
///scroll the page till element is displayed
		
//		WebElement ele=driver.findElement(By.xpath("//img[@alt='GeeksforGeeks']"));
//		
//		js.executeScript("arguments[0].scrollIntoView", ele);
//		System.out.println(js.executeScript("return window.pageYOffset"));
		
		
		//scroll page end of the dom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
