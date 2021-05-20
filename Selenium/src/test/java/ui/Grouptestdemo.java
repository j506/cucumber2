package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test(groups="user-registration")
public class Grouptestdemo {
	
    @Test(priority=1,groups="regression")
	public void test1()
	{
		System.out.println("test1");
	}
    @Test(priority=2,groups="regression")
    public void test2()
    {
    	System.out.println("test2");
    }
    @Test(groups={"regression","bvt"})
    public void  test3()
    {
    	System.out.println("test3");
    }
    @Test(groups="bvt")
    public void test4()
    {
    	System.out.println("test4");
    }
}
