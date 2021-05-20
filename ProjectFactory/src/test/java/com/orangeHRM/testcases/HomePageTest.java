package com.orangeHRM.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRM.Pages.HomePage;
import com.orangeHRM.base.BaseClass;

public class HomePageTest extends BaseClass {
	HomePage homePage;

	@Test(priority = 3)
	public void clickOnAdminTab() throws InterruptedException  {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homePage.clickOnAdminTab();
		Thread.sleep(2000);
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		String actualURL=BaseClass.driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}


}
