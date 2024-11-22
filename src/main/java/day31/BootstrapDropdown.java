package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click(); // opens dropdown
		
		// Select single option
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		//capture all option and find out size  
		
		
		
		
	}
}
