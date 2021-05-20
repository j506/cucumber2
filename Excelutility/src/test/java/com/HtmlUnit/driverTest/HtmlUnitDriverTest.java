package com.HtmlUnit.driverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {
	@Test

	public void headlessborwsertest() {
		// TODO Auto-generated method stub
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Headless test");
		String currenturl=driver.getCurrentUrl();
		System.out.println("current url is"+currenturl);
		String titleString=driver.getTitle();
		System.out.println("title of the webpage"+titleString);
		driver.close();

	}

}
