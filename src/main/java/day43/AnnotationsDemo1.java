package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* 1) Login --> @BeforeMethod //every Test method started
   2) Search --> @Test
   3) Logout --> @AfterMethod  //After Test method completed
   4) Login 
   5) Advanced search --> @Test
   6) Logout
   */

public class AnnotationsDemo1 {

	@BeforeMethod
	void login()
	{
		System.out.println("This is login...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout...");
	}
	
	@Test
	void search()
	{
		System.out.println("This is search...");
	}
	
	@Test
	void advanceSearch()
	{
		System.out.println("This is advance search...");
	}
}
