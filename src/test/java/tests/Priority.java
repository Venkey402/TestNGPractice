package tests;

import org.testng.annotations.Test;

public class Priority  extends BaseClass{
	
	@Test(priority=-1)
	public void m1()
	{
		logger.info(this.getClass().getName()+"-----Method1-----");
	}
	
	@Test(invocationCount=10)
	public void m2()
	{
		logger.info(this.getClass().getName()+"-----Method2-----");
	}

}
