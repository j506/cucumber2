package com.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	public void screenShot(String filename)
	{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot screenshot=(TakesScreenshot) driver;//here screenshot reference variable which is refered to driver object then driver is type cast with this takescreenshot interface
		File source=screenshot.getScreenshotAs(OutputType.FILE);//by the object refernce we can get the sceernshot and the screen shot we store in file format
		try {
			FileUtils.copyFile(source,new File(System.getProperty("user.dir")+ "\\Screenshot\\"+filename+"_"+dateName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
