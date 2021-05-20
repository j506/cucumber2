package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondrover.Action;
import com.mystore.base.BaseClass;

public class AddressPage extends BaseClass {
    @FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
    WebElement proceedToCheckOut;
    
    public AddressPage()
    {
    	PageFactory.initElements(driver, this);
    }
    public ShippingPage  clickOnCheckOut()
    {
    	Action.click(driver, proceedToCheckOut);
    	return new ShippingPage();
    }
    
}
