package pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	public void m1()
	{
		System.out.println("hello");
	}
	@Test
	public void m2()
	{
		System.out.println("hii");
	}
	@BeforeTest
    public void mn()
    {
    	System.out.println("mn will be executed");
    }
}
