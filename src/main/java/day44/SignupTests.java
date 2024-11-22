package day44;

import org.testng.annotations.Test;

public class SignupTests {

	
	@Test(priority = 1,groups = {"regression"})
	void signupByEmail()
	{
		System.out.println("This is signup by Email...");
	}
	
	@Test(priority = 2,groups = {"regression"})
	void signupByFacebook()
	{
		System.out.println("This is signup by Facebook...");
	}
	
	@Test(priority = 3,groups = {"regression"})
	void signupBytwitter()
	{
		System.out.println("This is signup by twitter...");
	}
}
