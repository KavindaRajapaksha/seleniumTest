package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardShortcutKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Kavinda");
        
        Actions act=new Actions(driver);
        
        //ctrl+A-select all
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        
        
        
        //ctrl+C-copy the text
        
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //ctrl+tab -shift to next box
        
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        
        //ctrl+V-paste text
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        
        
        
	}

}
