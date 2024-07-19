package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo  extends BaseClass{
	
	@Test(dataProvider="getData")
	public void m1(String name,String age, String gender)
	{
		logger.info(this.getClass().getName()+" Name : "+name+", age : "+age+", gender : "+gender);
	}
	
	@DataProvider
	public String[][] getData()
	{
		String data[][]= {{"venkat","35","male"},{"mahesh","29","male"},{"Ramu","63","male"}};
		
		return data;
		
	}
}
