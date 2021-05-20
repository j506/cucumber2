package com.testpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
@Listeners(com.utility.ListenerClass.class)
public class TestClass extends BaseClass{
	@Test
	public void testcase3()
	{
		setup();
		driver.findElement(By.name("q")).sendKeys("Screenshot demo");
		Assert.assertTrue(false);		
		
		
	}
	@Test
	public void testcase4()
	{
		setup();
		Assert.assertTrue(true);
		
		
	}
}
