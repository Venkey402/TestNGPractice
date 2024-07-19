package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsDemo  extends BaseClass{
	
	SoftAssert asserts = new SoftAssert();
	
	@Test
	public void EnableMethod1()
	{		
		asserts.assertTrue(true);
		logger.info(this.getClass().getName()+"-----assert True = true-----");
		asserts.assertTrue(false);
		logger.info(this.getClass().getName()+"-----assert true = false-----");
		asserts.assertEquals(true,false);
		logger.info(this.getClass().getName()+"-----assert equals = false-----");
//		asserts.assertAll();
	}
	
	@Test
	public void EnableMethod2()
	{
		asserts.assertTrue(false);
		logger.info(this.getClass().getName()+"-----EnableMethod2-----");
		asserts.assertAll();
	}
	
	
	@Test
	public void EnableMethod3()
	{
		asserts.assertEquals(true,false);
		logger.info(this.getClass().getName()+"-----EnableMethod2-----");		
		asserts.assertAll();
	}


}
