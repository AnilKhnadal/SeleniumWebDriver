package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("from")).sendKeys("mac");
		
		//id
		//boolean logDisplayedStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logDisplayedStatus);
		
		//linktext and partialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		//className
	/*	List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item")); // multiple web elements, findElements=Group elements
		System.out.println("Total number of header links : "+headerLinks.size()); // 7
		*/
		
		//tagName
		//List<WebElement> links = driver.findElements(By.tagName("a")); // <a>
		//System.out.println("Total number of links : "+links.size());
		
		 // List<WebElement> images = driver.findElements(By.tagName("img")); // <img>
		 // System.out.println("Total number of images : "+images.size());
		
		//xpath with contains()
		// driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		//xpath with start-with()
	    // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		// chained xpath(combination od Relative and absolute path)
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
		
		
		
	}
}
