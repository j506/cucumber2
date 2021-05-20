package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	    driver=new FirefoxDriver();
	}
	@Test(dataProvider="users")//data provider is the anotation of the @test
	public void logintest(String uname,String pass)
	{
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
		String s=driver.getTitle();
		String d="Welcome: Mercury Tours";
		Assert.assertEquals(s, d);
	}
	@DataProvider(name="users")//DataProvider is the anotation
    String[][] logintest()
	{
		String data[][]= {{"mercury","mercury"},{"mer","mer"},{"mercury1,mercury1"}};
		return data;
	}
    @AfterClass
    public void closebrowser()
    {
    	driver.close();
    }

}
