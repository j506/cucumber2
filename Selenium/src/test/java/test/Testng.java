package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	@BeforeTest
	public void logintoapplication()
	{
		System.out.println("it will execute before running all the test");
	}
	@Test
	@AfterTest
	public void test()
	{
		System.out.println("exedcute the first testcase");
	}
	@BeforeMethod
	public void Dbconnected()
	{
		System.out.println("Dbconnected");
	}
	@AfterMethod
	public void Dbdisconnected()
	{
		System.out.println("Dbdisconnected");
	}
	
    @Test(priority=1,description="i have to login with my credential",groups="regression")
	public void test1()
	{
		System.out.println("execute the final testcse");
	}
    @Test(priority=2,description="i have to logout this page")
    public void logout()
    {
    	System.out.println("i have successfully log out");
    }
}
