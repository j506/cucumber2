package Day22;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencymethod2 {
	@Test(priority=1)
	public void openURL()
	{
		System.out.println("open url");
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"openURL"})
	public void Login()
	{
		System.out.println("Login the page");
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods= {"Login"})
	public void search()
	{
		System.out.println("Searching the functionality of the aplication");
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods= {"Login","openURL"})
	public void adsearch()
	{
		System.out.println("search some advanced");
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"Login"})
	public void Logout()
	{
		System.out.println("Logout the page");
		Assert.assertTrue(true);
	}

}
