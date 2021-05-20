package com.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HandelDatePicker {
	WebDriver driver;
    @BeforeMethod
	public void setup()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		
		
		
		
	}
    @Test
	public void datepicker() throws InterruptedException
	{
		String month="June 2020";
		String day="13";
		driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]//input")).click();
		while(true)
		{
			
			String textString=driver.findElement(By.xpath("//table/thead/tr[2]/th[2]")).getText();
			if(textString.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//table/thead/tr[2]/th[1]")).click();
				
			}
			
		}
		driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),"+day+")]")).click();
		
	}

}
