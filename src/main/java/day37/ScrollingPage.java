package day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://boookers.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// 1) Scroll down page by pixel number
	/*	js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); // if horizontal use X
		*/
		
		// 2) scroll the page till element is visible
	/*	WebElement elt=driver.findElement(By.xpath("//h3[normalize-space()='Popular Holidays Packages']"));
		js.executeScript("arguments[0].scrollIntoView();", elt);
		System.out.println(js.executeScript("return window.pageYOffset;")); // 456
		*/
		
		// 3) Scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // if horizontal use Width
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//scrollig up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
}

