package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;

public class ListenerClass extends BaseClass implements ITestListener {
	public void onTestSuccess(ITestResult result)
	{
		
	}
	public void onTestFailure(ITestResult result)
	{
		screenShot(result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	public void onStart(ITestContext result)
	{
		
	}
	public void onFinish(ITestContext result)
	{
		
	}

}
