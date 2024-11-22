package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/register"); or accepts URL only in the string format
		
		//URL myurl=new URL("https://demo.nopcommerce.com/register");
		//driver.navigate().to(myurl); // internally it will cal get method
		
		driver.navigate().to("https://demo.nopcommerce.com/register"); // accepts URL in the string format & URL object format.
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // https://demo.nopcommerce.com/register
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		driver.navigate().refresh();
	}
}
