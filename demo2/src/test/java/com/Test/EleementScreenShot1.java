package com.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EleementScreenShot1 {
	WebDriver driver;
	@Test
	public void elementScreenShot1() throws IOException 
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
			
		    driver=new ChromeDriver();
			driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php?");
			WebElement element=driver.findElement(By.id("wp-submit"));
			//Get the entire page screen shot
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			BufferedImage fullimg= ImageIO.read(screenshot);
			
			//get the location and height and width of the element in the page
			Point point=element.getLocation();
			int elewidth=element.getSize().getWidth();
			int eleheight=element.getSize().getHeight();
			//to crop the entire page screenshot to get only element screenshot
			try
			{
				BufferedImage eleScreenshot=fullimg.getSubimage(point.getX(), point.getY(), elewidth, eleheight);
				ImageIO.write(eleScreenshot, "png", screenshot);
			}catch(Exception e) {
				e.getMessage();
			}
			File screenshotloaction=new File("C:\\Users\\user\\eclipse-workspace\\demo2\\ScreenShot\\elemenetscreenshot2.png");
			FileUtils.copyFile(screenshot, screenshotloaction);
			driver.close();
			
	}

}
