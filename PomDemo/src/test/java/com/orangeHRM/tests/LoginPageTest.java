package com.orangeHRM.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;

public class LoginPageTest {
	public WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	@BeforeMethod
	public void setup()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
	    LoginPage loginpage=new LoginPage(driver);
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
    public void verifyLogo()
    {
        
	    boolean flag=loginpage.validateLogo();
	    Assert.assertTrue(flag);
	    
	    
    }
	@Test
    public void verifyLogin()
    {
       
	    homepage=loginpage.login("Admin","admin123");
	    String ActualUrl=driver.getCurrentUrl();
	    String ExpectedUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	    Assert.assertEquals(ActualUrl, ExpectedUrl);
	    
	    
    }
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
