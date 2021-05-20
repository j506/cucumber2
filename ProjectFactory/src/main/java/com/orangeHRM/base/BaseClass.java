package com.orangeHRM.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangeHRM.Pages.LoginPage;

public class BaseClass {
	 
	 public static WebDriver driver;
	 public LoginPage loginPage;
	 public Properties prop;
	 
	 @BeforeMethod
	 public void setup() {
		 readConfig();
      System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  
	  driver.get(prop.getProperty("url"));
	  loginPage=new LoginPage();
	 
	 }
	 @AfterMethod
	 public void tearDown() {
	  driver.close();
	 }
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
	}
