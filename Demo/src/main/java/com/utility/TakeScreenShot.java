package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	public static void screenShot(WebDriver driver,String filename)
	{
		TakesScreenshot screenshot=(TakesScreenshot) driver;//here screenshot reference variable which is refered to driver object then driver is type cast with this takescreenshot interface
		File source=screenshot.getScreenshotAs(OutputType.FILE);//by the object refernce we can get the sceernshot and the screen shot we store in file format
		try {
			FileUtils.copyFile(source,new File(System.getProperty("user.dir")+ "\\Screenshot\\"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
