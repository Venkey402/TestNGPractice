package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo  extends BaseClass{
	
	@Parameters({"browser","username","password"})
	@Test(groups= {"sanity"})
	public void m1(String br, String uname, String pass)
	{
		logger.info(this.getClass().getName()+"-----Method1-----");
		logger.info("browser : "+br+" uname : "+uname+" pass : "+pass);
	}
	
	@Test
	public void m2()
	{
		logger.info(this.getClass().getName()+"-----Method2-----");
	}

}
