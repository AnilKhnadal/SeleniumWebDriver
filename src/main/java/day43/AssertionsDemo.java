package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void testTitle()
	{
		String exp_title="Opencart";
		String act_title="Openshop";
	
		// only conditional 
		
/*	if(exp_title.equals(act_title))
	{
		System.out.println("Test passed");
	}
	else 
	{
	    System.out.println("Test failed");	
	}
	*/
		//or only assertion
		
	Assert.assertEquals(exp_title, act_title);	
	
	   // or  assertion along with condition
	
	if(exp_title.equals(act_title))
	{
		System.out.println("Test passed");
		Assert.assertTrue(true);
	}
	else 
	{
	    System.out.println("Test failed");	
	    Assert.assertFalse(false);
	}
	}
}
