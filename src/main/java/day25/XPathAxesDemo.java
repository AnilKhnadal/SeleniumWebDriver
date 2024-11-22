package day25;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//Self - selects the current node
		String text = driver.findElement(By.xpath("//a[contains(text(),'Zomato']/self::a")).getText();
		System.out.println("Self : "+ text); //Zomato
		
		//Parent - Selects the parent of the current node (always one)
		text = driver.findElement(By.xpath("//a[contains(text(),'Zomato']/parent::td")).getText();
		System.out.println("Parent : "+text); //Zomato
		
		// Child - Select all children of the current node (One or More)
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Zomato']/ancestor::tr/child::td"));
		System.out.println("Number of child elements : "+childs.size()); //5
		
		//Ancestor - Selects all ancenstors (parent, grantparent and etc...)
		text = driver.findElement(By.xpath("//a[contains(text(),'Zomato']/ancestor::tr")).getText();
		System.out.println("Ancestoor : "+text);
		
		// Descendent -Selects all descendants (Children, Grandparent, etc..) of the current node
		List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'Zomato']/ancestor::tr/descendeant::tr"));
		System.out.println("Number of descendant node  : "+descendants.size()); // 7
		
		// Followinng - Selects everything in the document after the closing tag of the current node
		List<WebElement> followingNode = driver.findElements(By.xpath("//a[contains(text(),'Zomato']/ancestor::tr/following::tr"));
		System.out.println("Number of following node : "+followingNode);//267
		
		//Preseding - Selects all node that appear before the current node in the document
		List<WebElement> precedings = driver.findElements(By.xpath("//a[contains(text(),'Zomato']/ancestor::tr/preceding::tr"));
		System.out.println("Number of Following siblings : "+precedings.size());
		
		//following-siblings - selects all siblings after the current node
		List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(),'Zomato']/ancestor::tr/following-siblings::tr"));
		System.out.println("Number of Following siblings : "+followingsiblings.size());
		
		//preceding-siblings - selects all siblings before the current node
		List<WebElement> precedingsiblings = driver.findElements(By.xpath("//a[contains(text(),'Zomato']/ancestor::tr/preceding-siblings::tr"));
	    System.out.println("Number of preceding siblings : "+precedingsiblings.size());
	    
	    driver.quit(); 
	}
}
