package com.screenshottake;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.TakeScreenShot;

public class Screenshot {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	}
	@Test
	public void testcase1()
	{
		driver.findElement(By.name("q")).sendKeys("Screenshot demo");
		Assert.assertTrue(false);		
		
		
	}
	@Test
	public void testcase2()
	{
		
		Assert.assertTrue(true);
		
		
	}
	@AfterMethod
	public void TearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			TakeScreenShot.screenShot(driver, result.getName());
		}
		driver.close();
		
	}

}
