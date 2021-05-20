package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	@Test
	public void openURL()
	{
		System.out.println("it will execute before running all the test");
	}
	@Test
	public void Login()
	{
		System.out.println("exedcute the first testcase");
	}
	@Test
	public void Logout()
	{
		System.out.println("Dbconnected");
	}

}
