package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test1 {
	//@Parameters("a")
	@Parameters({"a","b"})
	@Test
	public void m1(String s,String s2)
	{
		System.out.println(s+s2);
	}

}
