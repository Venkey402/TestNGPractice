package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo  extends BaseClass{
	
	@Test
	public void EnableMethod1()
	{	
		Assert.assertTrue(true);
		logger.info(this.getClass().getName()+"-----EnableMethod1-----");
	}
	
	@Test
	public void EnableMethod2()
	{
		Assert.assertTrue(false);
		logger.info(this.getClass().getName()+"-----EnableMethod2-----");
	}
	
	
	@Test
	public void EnableMethod3()
	{
		Assert.assertEquals(true,false);
		logger.info(this.getClass().getName()+"-----EnableMethod2-----");
	}


}
