package learnjava;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public  class TestngSelenium
{
	WebDriver driver;

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("sign out");
	}
	@BeforeTest
	public  void beforeTest()
	{
		System.out.println("open chrome");
	    driver=new ChromeDriver();
		driver.manage().window().setPosition(new Point(2000,0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("open aut website");
		driver.get("https://the-internet.herokuapp.com/");
		
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Login the page");
		driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
	    driver.findElement(By.name("username")).sendKeys("tomsmith");
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
		
		
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("close the browser");
		driver.quit();
		
		
	}
	@BeforeSuite
	public void setup()
	{
		System.out.println("set up chrome browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	}
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("clean the cookies,send report to the teams");
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("close teh website");
		driver.close();
	}
	
	@Test
	public void test()
	{
		System.out.println("test the product");
		WebElement message=driver.findElement(By.xpath("//div[@id='flash']"));
		message.getText();
		Assert.assertEquals(true, message.getText());
		
		
		
		
	}
	@Test
	public void test2()
	{
		System.out.println("Add to cart");
		
	}
}



