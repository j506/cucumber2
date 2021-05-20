package TestngListnerExample;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test method is started ");
	}
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test method is passed");
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test methdo is failiure");
	}
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test method is skipped");
	}
	
	

}
