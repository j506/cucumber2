package com.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class FullScreenShot {
	WebDriver driver;
	@Test
	public void fullpagescreenshot()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/p/selenium-vi.html");
		//create the object of AShot() class and set the image strategy by shootingStrategy method
		//and viewportPasting method and take the screenshot using takescreenshot method
		Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "png", new File("C:\\Users\\user\\eclipse-workspace\\demo2\\ScreenShot\\fullscreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		driver.close();
		
	}


}
