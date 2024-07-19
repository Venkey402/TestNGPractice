package tests;

import org.testng.annotations.Test;

public class ListenersDemo  extends BaseClass{
	
	@Test
	public void m1()
	{
		logger.info(this.getClass().getName()+"-----Method1-----");
	}
	
	@Test
	public void m2()
	{
		logger.info(this.getClass().getName()+"-----Method2-----");
	}

}
