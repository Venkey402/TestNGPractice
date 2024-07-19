package tests;

import org.testng.annotations.Test;

public class GroupdsDemo  extends BaseClass{
		
	@Test(groups= {"sanity","regression","TC_1","login"})
	public void m1()
	{
		logger.info(this.getClass().getName()+"-----Method1-----");
	}
	
	@Test(groups= {"sanity","TC_2","login"})
	public void m2()
	{
		logger.info(this.getClass().getName()+"-----Method2-----");
	}
	
	@Test(groups= {"sanity","TC_3"})
	public void m3()
	{
		logger.info(this.getClass().getName()+"-----Method3-----");
	}
	
	@Test(groups= {"TC_4"})
	public void m4()
	{
		logger.info(this.getClass().getName()+"-----Method4-----");
	}


}
