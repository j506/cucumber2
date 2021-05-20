package com.orangeHRM.testcases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRM.Pages.HomePage;

import com.orangeHRM.base.BaseClass;

public class LoginPageTest extends BaseClass {
	 HomePage homePage;
	 
	 @Test(priority = 1)
	 public void logoTest() {
	  boolean flag=loginPage.validateLogo();
	  Assert.assertTrue(flag);
	 }
	 @Test(priority = 2)
	 public void loginTest() {
	  homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	  String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	  String actualURL=BaseClass.driver.getCurrentUrl();
	  Assert.assertEquals(actualURL, expectedURL);
	 }
	}