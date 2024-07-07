package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BotstrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
//      select sing option
      driver.findElement(By.xpath("//input[@value='java']")).click();
      //capture the all elements
       List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
       System.out.println(options.size());
       
       for (WebElement op : options) {
    	   String option=op.getText();
    	   if(option.equals("Java")||options.equals("Python")||options.equals("My SQL")) {
    		   op.click();
    	   }
       }
      
	}

}
