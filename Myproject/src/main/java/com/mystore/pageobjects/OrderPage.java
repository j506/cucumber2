package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrover.Action;
import com.mystore.base.BaseClass;

public class OrderPage extends BaseClass {
	@FindBy(xpath="//*[@id=\"product_price_1_1_0\"]/span")
	WebElement unitPrice;
	
	@FindBy(id="total_price")
	WebElement totalPrice;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceedToCheckOut;
	
	public OrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public double getUnitPrice() throws InterruptedException 
	{
		 Thread.sleep(3000);
		 String unitPrice1=unitPrice.getText();
		 String unit=unitPrice1.replaceAll("[^a-zA-Z0-9]", "");
		 double finalUnitPrice=Double.parseDouble(unit);
		 return finalUnitPrice/100;
	}
	public double getTotalPrice() 
	{
		
		 String totalPrice1=unitPrice.getText();
		 String tot=totalPrice1.replaceAll("[^a-zA-Z0-9]", "");
		 double finalTotalPrice=Double.parseDouble(tot);
		 return finalTotalPrice/100;
	}
	public LoginPage clickOnCheckOut() 
	{
		
		Action.click(driver, proceedToCheckOut);
		return new LoginPage();
	}

}
