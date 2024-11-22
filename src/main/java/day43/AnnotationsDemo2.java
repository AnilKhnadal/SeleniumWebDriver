package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* 1) Login -- @BeforeClass // before starting the test method
   2) Search -- @Test
   3) Advanced search -- @Test
   4) Logout -- @AfterClass  // After completing the test method
   */

public class AnnotationsDemo2 {

	@BeforeClass
	void login()
	{
		System.out.println("This is login...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout...");
	}
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search...");
	}
	
	@Test(priority = 2)
	void advanceSearch()
	{
		System.out.println("This is advance search...");
	}
}
