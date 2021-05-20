package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void verifyLogo() throws InterruptedException
	{
		indexPage=new IndexPage();
		boolean result=indexPage.validateLogo();
		Assert.assertTrue(result);
		
	}
	@Test
	public void verifyTitle() throws InterruptedException
	{
		String actTitle=indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store");
	}

	

}
