package Testng;

import org.testng.annotations.Test;

public class Testcase {
	@Test(priority=3)
    public void openURL()
	{
		System.out.println("by using the url open the website");
	}
	@Test(priority=1)
	void Login()
	{
		System.out.println("Login the page with some valid credentials");
	}
	@Test(priority=2)
	void Logout()
	{
		System.out.println("Logout the current opened page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
