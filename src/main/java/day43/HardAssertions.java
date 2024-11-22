package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
	//	Assert.assertEquals("xyz", "xyz"); // pass
	//	Assert.assertEquals(123, 123); // pass
		
	//	Assert.assertEquals("abc", 123); // fail
	//	Assert.assertEquals("123", 123); // fail
		
	//	Assert.assertNotEquals(123, 123); // fail
	//	Assert.assertNotEquals(123, 215); // pass
		
	//	Assert.assertTrue(true); // pass
	//	Assert.assertTrue(false); // fail
		
	//	Assert.assertTrue(1==2); // fail
	//	Assert.assertTrue(2==2); // pass
		
	//	Assert.assertFalse(1==2); // pass
	//	Assert.assertFalse(2==2); // fail
		
		Assert.fail();
	}
}
