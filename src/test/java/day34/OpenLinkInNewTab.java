package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        
        WebElement homeLink=driver.findElement(By.xpath("//a[@id='tryhome']"));
		  Actions act=new Actions(driver);
		  
		  act.keyDown(Keys.CONTROL).click(homeLink).keyDown(Keys.CONTROL).perform();
		  
		
	}

}
