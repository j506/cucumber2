package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.actiondrover.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	//Declare ThreadLocal Driver 
	//public static ThreadLocal<RemoteWebDriver> driver=new ThreadLocal<>();
	
	//public static WebDriver getDriver()
	//{
		//get the Driver from ThreadLocalmap
		//return driver.get();
		
	//}
	@BeforeTest
	 public void readConfig()
	 {
		 try {
			prop=new Properties();
			 FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"/Configuration/config.properties" );
			 prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	public static void launchApp()
	{
		WebDriverManager.chromedriver().setup();
		String browsername=prop.getProperty("browser");
		if(browsername.contains("Chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			//set Browser to ThreadLocalmap
			//driver.set(new ChromeDriver());
		}
		else if(browsername.equalsIgnoreCase("FireFox"))
		{
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			//driver.set(new FirefoxDriver());
		}
		else if(browsername.contains("IE"))
		{
			//WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			//driver.set(new InternetExplorerDriver());
		}
		
		
		driver.get(prop.getProperty("url"));
	}
	

}
