package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsExample2 {
	@BeforeClass
	public void login()
	{
		System.out.println("login the page");
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
	@AfterClass
	public void Logout()
	{
		System.out.println("Logout");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
