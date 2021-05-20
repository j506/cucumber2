package com.Test;

import org.testng.annotations.Test;

import com.utility.Log;

public class TestCase1 {
	@Test
	public void testCase1()
	{
		Log.startTestCase("testcase 1");
		Log.info("this is testcase 1");
		Log.endTestCase("testcase1");
		
	}
	@Test
	public void testcase2()
	{
		Log.startTestCase("Testcase2");
		Log.info("this is testcase2");
		Log.endTestCase("Testcase 2");
	}
	public void testcase3()
	{
		Log.startTestCase("testcase3");
		Log.info("this is testcase3");
		Log.endTestCase("testcase3");
	}

}
