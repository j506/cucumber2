package com.Test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class ElementScreenShot {
	WebDriver driver;
	@Test
	public void elementScreenShot()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement element=driver.findElement(By.id("btnLogin"));
		//coordinateProvider() basically get the cooridinate of the image
		Screenshot screenshot=new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,element);
		try {
			ImageIO.write(screenshot.getImage(), "png", new File("C:\\Users\\user\\eclipse-workspace\\demo2\\ScreenShot\\elementscreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}

}
