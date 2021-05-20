package youtubeMavenProject;

import org.testng.annotations.Test;

public class Testng {
	@Test(priority=1,description="this is the login page")
	public void login()
	{
		
		System.out.println("login test is passed");
	}
	@Test(priority=1,description="this is the logout page")
	public void logout()
	{
		System.out.println("logout is successfully");
	}
}
