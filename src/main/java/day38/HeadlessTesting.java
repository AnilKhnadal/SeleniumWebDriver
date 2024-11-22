package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--headless=new"); // setting for headless mode of execution
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://boookers.com/");
		
		String act_title = driver.getTitle();
		if(act_title.equals("Compare & Book The Best Holidays"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.quit();
	}
}
