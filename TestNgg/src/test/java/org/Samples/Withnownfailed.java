package org.Samples;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Withnownfailed implements IRetryAnalyzer
{

	int mincount=1,maxcount=5;

	public  boolean retry(ITestResult result) 
	{
		if(mincount<maxcount) 
		{
			mincount=mincount+1;
			return true;
		}
		return false;

	}
}
