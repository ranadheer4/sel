package com.olobby.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImptn implements IRetryAnalyzer{
    static int n=0; 
	int count=0;
	int retrylimit=3; 

	public boolean retry(ITestResult result) {

		if(count<retrylimit)
		{
			count++;
			return true;
		}
		return false;
		
	}

}
