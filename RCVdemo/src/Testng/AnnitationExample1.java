package Testng;

import org.testng.annotations.*;


public class AnnitationExample1 {
	@BeforeMethod
	public void login()
	{
		System.out.println("login the page");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout the page");
	}
	@Test
	public void search()
	{
		System.out.println("hello");
	}
	@Test
	public void Advsearch()
	{
		System.out.println("hello");
	}
	@Test
	public void recharge()
	{
		System.out.println("hello");
	}

}
