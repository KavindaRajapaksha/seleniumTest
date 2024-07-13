package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        // Switch to the iframe
        driver.switchTo().frame("iframeResult");

        // Locate the elements
        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        // Clear box1 and set text in box2
//        box1.clear();
//        box2.sendKeys("Kavinda");

        // Double click action on the button
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();
        
        //get text get only inner text only
        

        // Validate that box2 contains "Kavinda"
//        String name = box2.getAttribute("value");
//        System.out.println(name);

        // Close the driver
//        driver.quit();
    }
}
