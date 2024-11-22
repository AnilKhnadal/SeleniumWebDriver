package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000); // pause the execution bcz getWindowHandles()
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open new browser window
		Thread.sleep(5000);
		
		// driver.close(); // first browser closed
		
		driver.quit(); //close all windows
	}
}
