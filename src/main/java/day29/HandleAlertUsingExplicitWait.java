package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handle alert without using switchTo().alert();
// By using explicit wait method

public class HandleAlertUsingExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait declaration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		
		Alert myalrt = mywait.until(ExpectedConditions.alertIsPresent()); // capture alert
		
		System.out.println(myalrt.getText()); // I am a JS Alert
		myalrt.accept(); //click on Ok button.
	}

}
