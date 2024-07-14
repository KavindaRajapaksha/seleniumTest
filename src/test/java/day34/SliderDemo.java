package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        
        WebElement min_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
        WebElement max_slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
        
        System.out.println("Loacation of the min slider: "+min_slider.getLocation());
        

//        System.out.println("Loacation of the min slider: "+min_slider.getLocation().getX());
    
        Actions act=new Actions(driver);
        
        act.dragAndDropBy(min_slider, 100, 250).perform();
        System.out.println("new Location: "+min_slider.getLocation());
        
        System.out.println("Loacation of the max slider: "+max_slider.getLocation());
        
        act.dragAndDropBy(max_slider, -150, 250).perform();
        System.out.println("new Location: "+max_slider.getLocation());
        
        
//        Thread.sleep(2000);
        
//        driver.close();
        
        
	}

}
