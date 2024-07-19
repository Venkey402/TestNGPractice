package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun  extends BaseClass{

	@Test()
	public void m1()
	{
		logger.info(this.getClass().getName()+ " m1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"m1"},alwaysRun=true)
	public void m2()
	{
		logger.info(this.getClass().getName()+ " m2");
	}

}
