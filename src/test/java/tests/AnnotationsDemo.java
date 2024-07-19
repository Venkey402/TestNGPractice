package tests;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationsDemo extends BaseClass{
	
	@BeforeSuite
	public void beforeSuite()
	{		
		logger.info("----------------BeforeSuite----------------");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		logger.info("----------------BeforeTest----------------");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		logger.info("----------------BeforeClass----------------");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		logger.info("----------------BeforeMethod----------------");
	}
	
	@org.testng.annotations.AfterMethod
	public void afterMethod()
	{
		logger.info("----------------AfterMethod----------------");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		logger.info("----------------AfterSuite----------------");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		logger.info("----------------AfterTest----------------");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		logger.info("----------------AfterClass----------------");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		logger.info("----------------AfterMethod----------------");
	}	
}
