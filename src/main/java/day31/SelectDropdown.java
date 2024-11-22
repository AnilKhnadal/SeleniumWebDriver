package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryElm = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryElm);
		
		// Select option from the dropdown
		
	//	drpCountry.selectByVisibleText("France"); 
	//	drpCountry.selectByValue("uk"); // value is a Attritute
	//	drpCountry.selectByIndex(3);
		
		// capltures the options from the dropdown
		List<WebElement> options = drpCountry.getOptions();
		System.out.println(options);
		System.out.println("Total number of options in a dropdown : "+options.size()); // 10
		
		// printing the options
	/*	for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
		//enhanced for loop
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}
}
