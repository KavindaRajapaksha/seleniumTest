package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		//single file upload
		driver.findElement(By.xpath("//input[@id='img']")).sendKeys("filePath");
	}

}
