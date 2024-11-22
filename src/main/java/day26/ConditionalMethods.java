package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// isDisplayed()
		// WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		// System.out.println("Display status of logo : "+logo.isDisplayed());
		
		// boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		// System.out.println("Display status : "+status); //true
		
		// isEnbled() - used in inbox, checkbox, dropdown to validation purpose.
		// boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		// System.out.println("enable status : "+status); // true
		
		// isSelected()
		WebElement male_radio = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_radio = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection........");
		System.out.println(male_radio.isSelected());// false
		System.out.println(female_radio.isSelected());// false
		
		System.out.println("After selecting male...");
		male_radio.click(); // select male radio button
		System.out.println(male_radio.isSelected());// true
		System.out.println(female_radio.isSelected());// false
		
		System.out.println("After selecting female...");
		female_radio.click(); // select female radio button
		System.out.println(male_radio.isSelected());// false
		System.out.println(female_radio.isSelected());// true
		
		boolean newsletter_status = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("newsletter check box status : "+newsletter_status); // true
	}

}
