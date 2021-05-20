package com.BaseClass;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.utility.Log;

public class BaseClass {
	public WebDriver   driver;

	@BeforeSuite
	public void beforeSuite()
	{
		
		DOMConfigurator.configure("log4j.xml");
		Log.info("this is before suite method");
		
	}
	
	@BeforeMethod
	public void setup()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcwtANmab26pQpobpixoXNJKRzDSxFjVrYfN9pV1thnYIFthoFocHPPjMT6RtB80-u944dPZPicavKMdEfkj9j0yAJnT5j_Fe7mr-tfFKGYwA&smuh=61901&lh=Ac-RYyDbcPHaTTgVRSA");
	}
	@AfterSuite
	public void afterSuite()
	{
		Log.info("this is after suite method");
	}

}
