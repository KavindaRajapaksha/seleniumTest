package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
//        driver.switchTo().newWindow(WindowType.TAB);//new Tab
        driver.switchTo().newWindow(WindowType.WINDOW);//new window
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

	}

}
