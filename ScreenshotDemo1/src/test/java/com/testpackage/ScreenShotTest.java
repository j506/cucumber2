package com.testpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;

@Listeners(com.utility.ListenerClass.class)
public class ScreenShotTest  extends BaseClass {
	@Test
	public void testcase1()
	{
		setup();
		driver.findElement(By.name("q")).sendKeys("Screenshot demo");
		Assert.assertTrue(false);		
		
		
	}
	@Test
	public void testcase2()
	{
		setup();
		Assert.assertTrue(true);
		
		
	}
	@AfterMethod
	public void TearDown()
	{
		
		driver.close();
		
	}
}
