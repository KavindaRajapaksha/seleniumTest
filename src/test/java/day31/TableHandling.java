package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
         driver.manage().window().maximize();
         
         //find total number of rows in the table
//         List<WebElement> row=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
////         int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//         System.out.println("Number of rows:"+ row.size());
//         find the number of columns in a table
//         List<WebElement> columns=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
//         int columns =driver.findElements(By.tagName("th")).size();
//         System.out.println("Number of column:"+columns);
//         find data in specific column and row
//           String data=driver.findElement(By.xpath("//td[normalize-space()='Master In Selenium']")).getText();
//         String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
//           
//           System.out.println(data);
//         read the data from all coloumn and all rows
//         int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//         int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
         //
//       for (int i = 2; i <= rows; i++) {
//           for (int j = 1; j <= columns; j++) {
//               String ele = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]")).getText();
//               System.out.println(ele);
//           }
//       }
         
//         print a columns
         int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

      // Print the first column for each row starting from the second row
      for (int i = 2; i <= rows; i++) {
          String ele = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[1]")).getText();
          System.out.println(ele);
      }

      driver.close();
   
         
         
		

	}

}
