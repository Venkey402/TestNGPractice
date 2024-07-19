package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int maxRetry=3;
	int count=0;

	@Override
	public boolean retry(ITestResult result) {
		
		while(count<maxRetry)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
