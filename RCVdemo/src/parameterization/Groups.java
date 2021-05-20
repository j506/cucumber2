package parameterization;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups= {"smoke"})
	public void login()
	{
		System.out.println("user must come on the login page");
	}
	@Test(groups= {"smoke","sanity"})
	public void action()
	{
		System.out.println("user must give the cresential ");
	}
	@Test(groups= {"sanity","regression"})
	public void click()
	{
		System.out.println("user must click the login button");
	}
	@Test(groups= {"regression"})
	public void navigate()
	{
		System.out.println("user navigate to the home page");
	}
	@Test(groups= {"sanity"})
	public void verification()
	{
		System.out.println("user verify the text message with assertion.assertEquals()");
	}
	

}
