package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC2 {
	@Test
    public void m3()
    {
    	System.out.println("this is m3 testcses");
    }
	@Test
    void m4()
    {
    	System.out.println("THis is m4 test cses");
    }
	@Test
    void m5()
    {
    	System.out.println("this is m5 test cases");
    }
	@AfterClass
	public void nm()
	{
		System.out.println("nm method will be executed");
		Assert.assertTrue(false);
	}

}
