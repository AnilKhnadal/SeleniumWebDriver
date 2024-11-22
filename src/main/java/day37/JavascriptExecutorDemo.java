package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));
		
		// passing the text into inputbox -alternate of sendkeys()
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].setAttribute('value','Anil')",inputBox);
		
		// clicking of element - alternate of click()
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobtn);
		
			 
	}
}
