package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Link href="https://xyz.com"
2) https://xyz.com --> Server --> Status code
3) Status code >=400 broken link
   Status code <400 not abroken link
   */
   
public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int noOfBrokenLinks=10;
		
		for(WebElement linkElement:links)
		{
			String hrefattValue = linkElement.getAttribute("href");
			if(hrefattValue==null || hrefattValue.isEmpty())
			{
				System.out.println("href attribute value is null or empty. so not possible to check");
				continue;
			}
			
			// hit URL to the server
			try 
			{
			URL linkURL=new URL(hrefattValue); // converted href value from to URL format
			HttpURLConnection conn =(HttpURLConnection) linkURL.openConnection(); // open connection to the server
			conn.connect(); // connect to server and send request the server
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefattValue+"===> Broken link");
				noOfBrokenLinks++;
			}
			else
			{
				System.out.println(hrefattValue+"===> Not a Broken link");
			}
			} catch (Exception e) {
			}
		}
		System.out.println("No of broken links : "+noOfBrokenLinks);
	}
}
