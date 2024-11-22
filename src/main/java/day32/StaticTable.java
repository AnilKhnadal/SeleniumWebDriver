package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// 1) find total number of rows in table
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")); // multiple table
	//	List<WebElement> rows=driver.findElements(By.tagName("tr")); // If we have one single table than only use this method
		System.out.println("Number of rows : "+rows.size()); // 7
		
		// 2) find total number of columns in  table
		List<WebElement> cols=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")); // multiple table
   //	List<WebElement> rows=driver.findElements(By.tagName("th")); // If we have one single table than only use this method	
		System.out.println("Number of columns : "+cols.size()); // 4
		
		// 3) Read data from specific row and column (Ex : 5th row and 1st column)
		// String bookName=driver.findElement(By.xpath(" //table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookName); // Master In Selenium
		
		// 4) Read data from all the rows and columns
		
	/*	System.out.println("BookName"+"\t"+"Author"+"\t"+"Suject"+"\t"+"Price");
		
		for(int r=2; r<=rows.size(); r++)
		{
			for(int c=1; c<=cols.size(); c++)
			{
				String value = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t"); // tabloor formate
			}
		    	System.out.println();
		}
		
		*/
		
		// 5) Print Book name whose author is Mukesh
		
	/*	for(int r=2; r<=rows.size(); r++)
		{
			String authorName = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				String bookNmae = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookNmae+"\t"+authorName);
			}
		}
		*/
		
		// 6) Find total price of all the book
		
		int total=0;
		for(int r=2; r<=rows.size(); r++)
		{
			String price = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("Total price of the books : "+total);
	}
}
