package day20;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Test Case

1.launch browser
2.open URL "https://demo.opencart.com/"
3.Validate title should be "Your Store"
4.close browser

*/


import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args){
//        1.launch browser
//        ChromeDriver driver=new ChromeDriver();
          WebDriver driver=new ChromeDriver(); //upCasting

//        2.open URL "https://demo.opencart.com/"
        driver.get("https://demo.opencart.com/");

//        3.Validate title should be "Your Store"
       String actTitle=driver.getTitle();
       if(actTitle.equals("Your Store")){
           System.out.println("Test Case Passed");
       }else{
           System.out.println("Test failed");
       }

//        4.close browser
//         driver.close();
         driver.quit();




    }
}
