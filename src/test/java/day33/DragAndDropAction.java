package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
	
	    Actions act= new Actions(driver);
	
	WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
	WebElement target=driver.findElement(By.xpath("//div[@id='box106']"));
	act.dragAndDrop(madrid, target).perform();
	
	
	}

}
