package day21;

import org.testng.annotations.Test;

public class FirstTestcase {
	@Test
    void openURL()
	{
		System.out.println("by using the url open the website");
	}
	@Test
	void Login()
	{
		System.out.println("Login the page with some valid credentials");
	}
	void Logout()
	{
		System.out.println("Logout the current opened page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
