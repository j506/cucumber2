package com.orangeHRM.testcases;

import org.testng.annotations.Test;

import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.Pages.SystemUserPage;
import com.orangeHRM.base.BaseClass;

public class SystemUserPageTest extends BaseClass {
	
	SystemUserPage sys;
	HomePage homePage;
	@Test(priority=4)
	public void clickonApply()
	{
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		sys=homePage.clickOnAdminTab();
		sys.clickonApply();
		
	}
	
	 
	 
	  

}
