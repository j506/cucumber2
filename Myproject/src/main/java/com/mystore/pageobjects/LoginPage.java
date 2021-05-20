package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrover.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signInBtn;
	
	@FindBy(name="email_create")
	WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	WebElement createNewAccoutBtn;
	
	@FindBy(name="SubmitLogin")
	WebElement signInBtn1;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public HomePage login(String uname,String pswd)
	{
		Action.type(username,uname);
		Action.type(password, pswd);
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	public AddressPage login1(String uname,String pswd) throws InterruptedException
	{
		Thread.sleep(2000);
		Action.type(username,uname);
		Action.type(password, pswd);
		Action.click(driver, signInBtn1);
		return new AddressPage();
	}
	public AccountCreationPage createNewAccount(String newEmail)
	{
		Action.type(emailForNewAccount, newEmail);
		Action.click(driver, createNewAccoutBtn);
		return new AccountCreationPage();
	}

}
