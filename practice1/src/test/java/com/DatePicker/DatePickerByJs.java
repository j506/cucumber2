package com.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerByJs {
	WebDriver driver;
    @BeforeMethod
	public void setup()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		
		
		
		
	}
    @Test
    public void Datepickertestbyjs()
    {
    	WebElement element=driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]//input"));
    	String dateString="02/05/2017";
    	datepickerbyjs(driver, dateString, element);
    	
    }
    public void datepickerbyjs(WebDriver driver,String date,WebElement element)
    {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].setAttribute('value','"+date+"')",element );
    }

}
