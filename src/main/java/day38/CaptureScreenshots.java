package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://boookers.com/");
		driver.manage().window().maximize();

		// 1) full page screenshot
		
	/*	 TakesScreenshot ts=(TakesScreenshot)driver; File
		 sourceFile=ts.getScreenshotAs(OutputType.FILE); // System.getProperty =
		 Redirect to corrent project location File targetFile=new
		 File(System.getProperty("user.dir")+"\\Screenshots\\fullpage1.png");
		 sourceFile.renameTo(targetFile);// copy sourceFile to targetFile
		 */

		// 2) capture the screenshot of specific section
	/*	WebElement whyChooseUs = driver.findElement(By.xpath("//div[@class='whywe_arebest']"));
		File sourceFile = whyChooseUs.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\whyChooseUs.png");
		sourceFile.renameTo(targetFile);// copy sourceFile to targetFile
        */

		// 3) capture the screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//a[@class='mylogo']//img"));
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\Screenshots\\logo.png");
		sourceFile.renameTo(targetFile);// copy sourceFile to targetFile

		driver.quit();
	}
}
