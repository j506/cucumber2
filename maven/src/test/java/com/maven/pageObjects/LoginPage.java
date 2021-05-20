package com.maven.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
    public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	@FindBy(xpath="//input[@value='Log in']")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement lnklogout;
	
	public void setUsername(String uname)
	{
		txtEmail.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void ClickLogin()
	{
		btnlogin.click();
	}
	public void ClickLogout()
	{
		lnklogout.click();
	}
	
	
	
	
	

}
