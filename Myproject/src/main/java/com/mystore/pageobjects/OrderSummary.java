package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrover.Action;
import com.mystore.base.BaseClass;

public class OrderSummary extends BaseClass{
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	WebElement confirmOrderBtn;
	
	public OrderSummary()
	{
		PageFactory.initElements(driver, this);
	}
	public OrderConfirmationPage clickOnconfirmOrderBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		Action.click(driver, confirmOrderBtn);
		return new OrderConfirmationPage();
	}

}
