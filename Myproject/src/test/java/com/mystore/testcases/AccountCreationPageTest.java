package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass {
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homepage;
	AccountCreationPage accountCreationPage;
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
    public void verifyAccountCreatePageTest() throws InterruptedException
    {
         indexPage=new IndexPage();
         loginPage=indexPage.clickOnSignIn();    
         accountCreationPage=loginPage.createNewAccount("jagannathmoharana960@gmail.com");
         boolean result=accountCreationPage.validateAccountCreationPage();
         Assert.assertTrue(result);
    }
}
