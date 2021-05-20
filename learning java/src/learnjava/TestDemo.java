package learnjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
	test t=new test();
	@Test
	public void testAdd()
	{
		int c=t.addition(6, 4);
	    Assert.assertEquals(c, 10);
	}
	@Test
	public void testSub()
	{
		int c=t.substraction(6, 4);
		Assert.assertEquals(c, 2);
	}
	@Test
	public void testMul()
	{
		int c=t.multiplication(6, 4);
		Assert.assertEquals(c, 24);
	}
	@Test
	public void testDiv()
	{
		int c=t.division(6,3);
		Assert.assertEquals(c, 2);
	}

}
