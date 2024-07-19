package tests;

import org.testng.annotations.Test;

public class Enable  extends BaseClass{
	
	@Test()
	public void EnableMethod1()
	{
		logger.info(this.getClass().getName()+"-----EnableMethod1-----");
	}
	
	@Test(enabled=false)
	public void EnableMethod2()
	{
		logger.info(this.getClass().getName()+"-----EnableMethod2-----");
	}


}
