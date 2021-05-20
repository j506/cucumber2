package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import test.utils;

public class dataread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		String path="C://Users//user//eclipse-workspace//apachi poi//Excelfile//Login1.xlsx";
		
		int rows=utils.getRowCount(path, "Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
		String username=utils.getCellData(path,"Sheet1",i, 0);
		String password=utils.getCellData(path, "Sheet1",i, 1);
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("submit")).click();
		
		if(driver.getTitle().equals("Login: Mercury Tours"))
		{
			System.out.println(" test passed");
			utils.setCellData(path,"Sheet1", i, 2, "Passed");
			
		}
		else
		{
			System.out.println(" test failed");
			utils.setCellData(path,"Sheet1", i, 2, "Failed");
		}
		
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		}
		
		driver.close();
		

	}

}
