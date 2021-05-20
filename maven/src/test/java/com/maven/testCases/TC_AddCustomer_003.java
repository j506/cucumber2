package com.maven.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.pageObjects.AddCustomerPage;
import com.maven.pageObjects.LoginPage;

public class TC_AddCustomer_003 extends BaseClass {
	@Test
    public void addNewCustomer () throws IOException, InterruptedException
    {
        driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("User name is provided");
		
		lp.setPassword(password);
		logger.info("password is provided");
		
		lp.ClickLogin();
		Thread.sleep(2000);
		
		logger.info("providing customer details....");
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickOnCustomersMenuItem();
		addcust.clickOnCustomersMenuItem();
		
		addcust.clickOnAddnew();
		
		String email =  "jagannathmoharana96@gmail.com";
		addcust.setEmail(email);
				
		addcust.setPassword("test123");
		
		//Registered - default
		//The customer cannot be in both 'Guests' and 'Registered' customer roles
		//Add the customer to 'Guests' or 'Registered' customer role
		addcust.setFirstName("Pavan");
		addcust.setLastName("Kumar");
		addcust.setGender("Male");
		addcust.setDob("7/05/1985"); // Format: D/MM/YYY
		addcust.setCompanyName("busyQA");
		addcust.setNewsLetter("Test store 2");
		addcust.setCustomerRoles("Guest");
		
		
		addcust.setManagerOfVendor("Vendor 2");
		
		
		
		
		
		
		
		
		addcust.setAdminContent("This is for testing.........");
	
		addcust.clickOnSave();
		logger.info("validation started....");
		
		//String msg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();
		
		String msg = driver.findElement(By.tagName("body")).getText();
			
		
		if(msg.contains("The new customer has been added successfully"))
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
			
		
	
		
    }
}
