package Day22;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencymethod {
	@Test(priority=1)
	public void openURL()
	{
		System.out.println("open url");
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public void Login()
	{
		System.out.println("Login the page");
		Assert.assertTrue(true);
	}
	@Test(priority=3,enabled=false)
	public void search()
	{
		System.out.println("Searching proceess is still going...............  of the aplication");
		Assert.assertTrue(true);
	}
	@Test(priority=4,enabled=false)
	public void adsearch()
	{
		System.out.println("adsearch process......... ");
		Assert.assertTrue(true);
	}
	@Test(priority=5)
	public void Logout()
	{
		System.out.println("Logout the page");
		Assert.assertTrue(true);
	}

}
