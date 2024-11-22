package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//get() - open the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000); // bcz getWindowHandles()
		
		// getTitle() - returns title of the page
        System.out.println(driver.getTitle());
        
        // getCurrentUrl() - returns URL of the page
        System.out.println(driver.getCurrentUrl());
       
       // getPageSource() - returns source code of the page
	   // System.out.println(driver.getPageSource());
		
	   // getWindowHandle() - returns ID of the single Browser window
	   // String windowID = driver.getWindowHandle();
	   // System.out.println("Window ID : "+windowID); // dynamic ID : 690878CA31F51BBDCD27E458F4A2AFE2
		
	   // getWindowHandles() - returns ID's of the mltiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open new browser window
		Set<String> windowIDs = driver.getWindowHandles(); // set it will not allows the duplicate value
		System.out.println(windowIDs); // [60F08FE4D18CDE6DC0A77A124490F960, 7F423C474A9BB891F8B576654AA30E44]s
		
	}
}
