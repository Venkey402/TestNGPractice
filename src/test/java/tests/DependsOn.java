package tests;

import org.testng.annotations.Test;

public class DependsOn  extends BaseClass{
	
	@Test
	public void EnableMethod1()
	{	
//		Assert.fail();
		logger.info(this.getClass().getName()+"-----EnableMethod1-----");
	}

	@Test(dependsOnMethods= {"EnableMethod1"})
	public void EnableMethod3()
	{	
		logger.info(this.getClass().getName()+"-----EnableMethod3-----");
	}
	
	@Test(dependsOnMethods= {"EnableMethod1","EnableMethod3"})
	public void EnableMethod2()
	{
		logger.info(this.getClass().getName()+"-----EnableMethod2-----");
	}


}
