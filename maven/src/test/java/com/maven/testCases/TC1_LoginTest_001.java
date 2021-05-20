package com.maven.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.maven.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC1_LoginTest_001 extends BaseClass {
	
	
	
	@Test
	public void login() throws IOException
	{
		logger.info("Url is opened");
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("User is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.ClickLogin();
		logger.info("clicked the login button");
		if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			Assert.assertTrue(true);
			lp.ClickLogout();
			logger.info("clicked the logout button");
		}
		else {
			captureScreen(driver,"loginTest");
			logger.info("Login Failed");//logger msg
			Assert.assertTrue(false);
		}

		
		
	}

	
	

}
