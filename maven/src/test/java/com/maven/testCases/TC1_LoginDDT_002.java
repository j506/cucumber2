package com.maven.testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.maven.pageObjects.LoginPage;
import com.maven.utilities.XLUtils;

public class TC1_LoginDDT_002 extends BaseClass
{
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd) throws InterruptedException, IOException {
		
		driver.get(baseURL);
		driver.manage().window().maximize(); 
		
		LoginPage lp = new LoginPage(driver);
				
		lp.setUsername(user);
		logger.info("User provided"); //logger msg
		
		lp.setPassword(pwd);
		logger.info("Password provided");//logger msg
		
		lp.ClickLogin();
		logger.info("Login in Clicked");//logger msg
		
		Thread.sleep(2000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			lp.ClickLogout();
			Assert.assertTrue(true);
					
		} else {
			logger.info("Login Failed");//logger msg
			Assert.assertTrue(false);
		}

	}
		
	
	@DataProvider(name="LoginData")
	public String [][] getData()
	{
	     String data[][]={{"",""},{"mer","mer"},{"mercury1,mercury1"}};
	     return data;
		
	}
	
	
}
