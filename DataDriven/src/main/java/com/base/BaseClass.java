package com.base;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.utility.NewExcelLibrary;

public class BaseClass {
	public WebDriver driver;
	NewExcelLibrary obj=new NewExcelLibrary("C:\\Users\\user\\eclipse-workspace\\DataDriven\\TestData\\User2.xlsx");
	@BeforeMethod
	public void setup()
	{
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name = "Credentials")
	 public Object[][] getData() {

	  Object[][] data = new Object[3][2];

	  data[0][0] = "admin";
	  data[0][1] = "admin123";

	  data[1][0] = "admin1";
	  data[1][1] = "admin123";

	  data[2][0] = "admin2";
	  data[2][1] = "admin";

	  return data;
	 }
	@DataProvider(name="Credentials1")
	public Object[][] excelData()
	{
		//total row count
		int rows=obj.getRowCount("Sheet1");
		//total column
		int columns=obj.getColumnCount("Sheet1");
		int actRows=rows-1;
		Object[][] data=new Object[actRows][columns];
		for(int i=0;i<actRows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				data[i][j]=obj.getCellData("Sheet1", j, i+2);
			}
		}
		return data;
	}

}
