package day47;

import java.util.List;

// Using PageFactory

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// Using PageFactory
public class LoginPage1 {
	
	WebDriver driver;
	
    // constructor - Initiate the driver
	
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); // Mandatory driver find the Locators
	}
	
	// Locators
	
	@FindBy(xpath="//input[@placeholder='Username']") // or @FindBy(how=How.xpath, using="//input[@placeholder='Username']")     
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']") 
	WebElement btn_login;
	
	@FindBy(tagName="a")
	List<WebElement> links;

	// Action methods - By using the locators we can perform the action
	
    public void setUserName(String user)
	{
    	txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}


