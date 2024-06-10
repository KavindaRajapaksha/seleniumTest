package day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AssignmentTestCase {
   public static void main(String[] args){
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.nopcommerce.com");

       String title= driver.getTitle();

       if(title.equals("nopCommerce demo store")){
           System.out.println("test case 2 passed!");
       }else{
           System.out.println("test case 2 failed");
       }

       driver.close();

   }


}
