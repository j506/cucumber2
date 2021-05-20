package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDemo {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		
	}
	@Test(priority=1,description="luch app")
	public void testcase1()
	{
		boolean img=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
		Assert.assertTrue(img);
		
	}
	
	@Test(priority=2,description="Login functionality test")
	public void testcase2()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		boolean img1=driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]")).isDisplayed();
		Assert.assertTrue(img1);
		
		
	}
	@Test(priority=3,description="title test")
	public void testcase3()
	{
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualurl, expectedurl);
	}
	@Test(priority=4,description="verify url")
	public void testcase4()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="OrangeHRM";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test(priority=5,description="Logout Test",enabled=false)
	public void testcase5() throws InterruptedException
	{
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		Assert.assertEquals(actualURL, expectedURL);
	}
	@AfterClass
	public void terDown()
	{
		driver.close();
	}
	

}
