package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
openapp
login
search
advsearch
logout
 */
// If mehod is failed, the dependency methods will be skips
public class DependencyMethods {

	@Test(priority = 1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, dependsOnMethods = {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3, dependsOnMethods = {"login"})
	void search()
	{
		Assert.assertTrue(false);
	}

	@Test(priority = 4, dependsOnMethods = {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5, dependsOnMethods = {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
}
