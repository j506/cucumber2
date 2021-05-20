package com.orangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangeHRM.base.BaseClass;

public class SystemUserPage extends BaseClass {
	
	
	@FindBy(xpath="//*[@id=\"menu_admin_nationality\"]")
	 WebElement applyTab;
	public SystemUserPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Notification clickonApply()
	{
		applyTab.click();
		return new Notification();
	}
}
