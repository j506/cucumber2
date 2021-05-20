package test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skilldemotest {
	Boolean datasetup=false;
	@Test(enabled=false)//enabled basically willnot execute the testcase at all//first way
	public void Skiptest1()
	{
		System.out.println("the perticular testcase is not complete");
	}
	@Test
	public void Skiptest2()//this is the second way
	{
		System.out.println("shipping this testcase forcefully");
		throw new SkipException("skipping this test");
	}
	@Test
	public void Skiptest3()//
	{
		System.out.println("skipping this testcases based on the condition");
		if(datasetup==true)
		{
			System.out.println("Execute");
		}
		else
		{
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
		
	}

}
