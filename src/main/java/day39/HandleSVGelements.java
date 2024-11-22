package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSVGelements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// abs path
	    //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/svg")).click(); // NoSuchElementException
	
	    // rel path using text
		//driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();
		
		// identify svg element
		driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click(); // NoSuchElementException
	}
}
