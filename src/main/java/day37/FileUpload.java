package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		// single file upload - text.txt
	/*	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("E:\\text.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("text.txt"))
		{
			System.out.println("File is successfully uploaded..");
		}
		else 
		{
			System.out.println("File is not uploaded..");
		}
		*/
		
		// Multiple Files uploaded
		String file1="E:\\text.txt";
		String file2="E:\\text1.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		// Validation 1 - Number of files
		if(noOfFilesUploaded==2)
		{
			System.out.println("All Files are uploaded..");
		}
		else
		{
			System.out.println("Incorrect Files are uploaded..");
		}
		
		// Validate file name 
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("text.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("text1.txt"))
		{
			System.out.println("File names matching..");
		}
		else
		{
			System.out.println("File names are not matching..");
		}
	}
}
