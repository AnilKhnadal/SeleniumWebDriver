package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://boookers.com/");
		driver.manage().window().maximize();
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Hotels']"));
		
		Actions act=new Actions(driver);
		
		// Control+RegLink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		// Swithing to registration page
		
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		//Swith to Hjotel search page
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//input[@id='hotel_destination_search_name']")).sendKeys("Dubai");
		
		//Home page
		driver.switchTo().window(ids.get(0));
		
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("Kuwait");
	}
}
