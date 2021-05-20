package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By loginBtn=By.xpath("//*[@id=\"btnLogin\"]");
	By  logo=By.xpath("//*[@id=\"divLogo\"]/img");
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public boolean validateLogo()
	{
		driver.findElement(logo).isDisplayed();
		return true;
	}
	public HomePage login(String uname,String pwd)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new HomePage();
	}

}
