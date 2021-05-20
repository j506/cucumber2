package com.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.utility.Log;

public class TestClass2 extends BaseClass{
	   @Test
       public void wordPressTest()
       {
    	   Log.startTestCase("wordPressTest");
    	   Log.info("entering the username");
    	   driver.findElement(By.id("email")).sendKeys("9439466479");
    	   Log.info("entering the password");
    	   driver.findElement(By.id("pass")).sendKeys("jagannath");
    	   Log.info("click the login button");
    	   driver.findElement(By.name("login")).click();
    	   Log.info("click the button");
    	   driver.findElement(By.xpath("//*[@id=\"mount_0_0_7K\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div")).click();
    	   Log.info("get the current url");
    	   String urlString=driver.getCurrentUrl();
    	   String Expected="https://www.facebook.com/";
    	   Log.info("validate");
    	   Assert.assertEquals(urlString,Expected);
    	   Log.info("successed");
    	   Log.endTestCase("testcases are finished");
    	   
    	   
       }
}
