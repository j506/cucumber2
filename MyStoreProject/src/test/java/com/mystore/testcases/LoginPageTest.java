package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.utility.Log;

public class LoginPageTest extends BaseClass {
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homepage;
	@Parameters("browser")
	@BeforeMethod(groups={"Smoke","Sanity","Regression"})
	public void setup(String browser)
	{
		launchApp(browser);
	}
	@AfterMethod(groups={"Smoke","Sanity","Regression"})
	public void tearDown()
	{
		getDriver().quit();
	}
	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class,groups= {"Smoke","Sanity"})
	public void loginTest(String uname,String pswd) throws InterruptedException
	{
		Log.startTestCase("loginTest");
		IndexPage indexPage=new IndexPage();
		Log.info("user is going to click on SignIn");
		loginPage=indexPage.clickOnSignIn();
		Log.info("enter username and password");
		//homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage=loginPage.login(uname,pswd);
		String actURL=homepage.currentUrl();
		String expectedURL="http://automationpractice.com/index.php?controller=my-account";
		Log.info("Verfying if user is able to login");
		Assert.assertEquals(actURL, expectedURL);
		Log.info("Login is successfull");
		Log.endTestCase("loginTest");
	}
	
}
