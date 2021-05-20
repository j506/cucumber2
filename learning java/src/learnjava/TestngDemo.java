package learnjava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {

	@Test
	public void openURL()
	{
		System.out.println("test");
	}
	@Test
	public void Login()
	{
		System.out.println("test2");
	}
	@Test
	void Logout()
	{
		System.out.println("test3");
	}

}
