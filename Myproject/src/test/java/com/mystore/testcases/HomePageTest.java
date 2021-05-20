package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass{
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homepage;
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
	public void wishListTest() throws InterruptedException
	{
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		boolean result=homepage.validateWishList();
		Assert.assertTrue(result);
		
	}
	@Test
	public void orderHistoryandDetailsTest() throws InterruptedException
	{
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnSignIn();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		boolean result=homepage.validateOrderHistory();
		Assert.assertTrue(result);
		
	}
}
