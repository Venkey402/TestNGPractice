package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Reporting implements ITestListener{	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("------------- "+result.getName()+" On Test Start"+" -------------");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("------------- "+result.getName()+" On Test Failure"+" -------------");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("------------- "+result.getName()+" On Test Success"+" -------------");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("------------- "+result.getName()+" On Test skipped"+" -------------");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("------------- "+result.getName()+" On Test failed"+" -------------");
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("------------- "+context.getName()+" On Start"+" -------------");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("------------- "+context.getName()+" On Finish"+" -------------");
	}
	
	

}
