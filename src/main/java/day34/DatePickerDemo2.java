package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	//user defined method for converting month from string --> Month
	static Month convertMonth (String month)
	{
		HashMap<String, Month> monthMap=new HashMap<String, Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER );
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		
		if(vmonth==null)	
		{
			System.out.println("Invalid Month");
		}
		return vmonth;
	}
	
	static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate )
	{
		// select year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select selectYear=new Select(yearDropdown);
		selectYear.selectByVisibleText(requiredYear);
		
	/*	// select month - method 1
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select selectMonth=new Select(monthDropdown);
		selectMonth.selectByVisibleText(month);
		*/
		
		// select month - method to
		while(true)
		{
			String displayMonth=driver.findElement(By.xpath("//select[@title='Change the month']")).getText();
			
			// Convert requiredMonth and displayMonth in to Month objects
			Month expectedMonth = convertMonth(requiredMonth);
			Month currentMonth = convertMonth(displayMonth);
			
			//compare
			int result = expectedMonth.compareTo(currentMonth);
			
			// 0    month are equal
			// >0   future month
			// <0   past month
			
			if(result<0) //  past
			{
				driver.findElement(By.xpath("//a[normalize-space()='<Prev']")).click();
			}
			else if(result>0) // future
			{
				driver.findElement(By.xpath("//a[normalize-space()='Next>']")).click();
			}
			else 
			{
				break;
			}
		}
		
		// select date
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='datepick-month']//table//tr//td/a"));

		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(requiredDate))
			{
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		// Input DOB
		String requiredYear = "2023";
		String requiredMonth = "May";
		String requiredDate = "26";
		
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
		driver.findElement(By.xpath("//body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[5]/i[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Datepicker']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		
		selectDate(driver, requiredYear, requiredMonth, requiredDate);
	}
}
