package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 Test case	
 ---------
 1) Launch browser (chrome)
 2) Open URL https://boookers.com/
 3) Validate title should be " Compare & Book The Best Holidays"
 4) close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		//  1) Launch browser (chrome)
		
		// ChromeDriver driver=new ChromeDriver();
		// WebDriver driver=new ChromeDriver();
		
//		WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		
		// 2) Open URL https://boookers.com/
		driver.get("https://boookers.com/");
		
		// 3) Validate title should be " Compare & Book The Best Holidays"
		
		String act_title = driver.getTitle();
		if(act_title.equals("Compare & Book The Best Holidays"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		// 4) close browser
		
//		driver.close();
		driver.quit();
	}
}
