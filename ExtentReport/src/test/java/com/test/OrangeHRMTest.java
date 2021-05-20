package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BasePackage.BaseClass;
import com.extentManager.ExtentManager;

public class OrangeHRMTest extends BaseClass {
	@Test
	public void loginPageTest()
	{
		
		WebElement imgElement=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Assert.assertTrue(imgElement.isDisplayed());
	}
	@Test
	public void loginTest()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		driver.findElement(By.id("btnLogin")).click();
		
		String actualtitle=driver.getTitle();
		String expectedtitle="OrangeHRM1";
		
		Assert.assertEquals(actualtitle,expectedtitle);
	}
	@Test
	public void sampleTest()
	{
		
		ExtentManager.test.createNode("Validation 1");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation 2");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation 3");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation 4");
		Assert.assertTrue(true);
	}

}
