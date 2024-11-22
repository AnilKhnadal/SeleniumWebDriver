package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		
		//Selenium4.x 
	//	driver.switchTo().newWindow(WindowType.TAB); // new window open
		driver.switchTo().newWindow(WindowType.WINDOW); // open new window
		
		driver.get("https://orangehrm.com/");
				
	}
}
