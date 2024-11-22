package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
//	@Test
	void test_hardassertios()
	{
		System.out.println("testing1...");
		System.out.println("testing2...");
		
		Assert.assertEquals(1,2); ; // hard assertion , If assertion fail rest of the code will not be execute
		
		System.out.println("testing3...");
		System.out.println("testing4...");
	}

	@Test
	void test_softassertions()
	{
		System.out.println("testing1...");
		System.out.println("testing2...");
		
		SoftAssert sa=new SoftAssert(); // soft assertion
		sa.assertEquals(2,2);
		
		System.out.println("testing3...");
		System.out.println("testing4...");
		
		sa.assertAll(); // mandatory (In soft assertion)
	}
}
