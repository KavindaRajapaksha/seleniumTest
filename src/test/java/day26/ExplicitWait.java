package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions; // Correct import
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Declaration of maximum 10 sec flexible time
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        // Correct usage of ExpectedConditions
        WebElement txtusername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        WebElement loginButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")));

        WebElement txtpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));


        txtusername.sendKeys("Admin");
        txtpassword.sendKeys("123");
        loginButton.click();



    }
}
