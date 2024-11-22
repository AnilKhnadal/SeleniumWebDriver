package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // passed frame as a web element // switch to frame1
		driver.findElement(By.xpath("(//input[@name='mytext1'])")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		
		
		//Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='framef_2.html']")); // if id name not avalaible than only use
		driver.switchTo().frame(frame2); 
		driver.findElement(By.xpath("(//input[@name='mytext2'])")).sendKeys("Selenium");
		driver.switchTo().defaultContent();

		//Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']")); // if id name not avalaible than only use
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("(//input[@name='mytext3'])")).sendKeys("Java");
		
		// inner iframe - part of frame 3
		driver.switchTo().frame(0); // frame 3 having only one inner frame (Index using)
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
		//Frame 5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']")); // if id name not avalaible than only use
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("(//input[@name='mytext5'])")).sendKeys("Automation");
		
		// inner iframe - part of frame 5
	
	}
}
