package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	
	
	@Parameters("browser")
	@Test(priority=1)
	public void launchbrowser(String br) {

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Downloads\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
	    }
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
	}

	@Test(priority=2)
	public void verifyTitle() {
		
		Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
	}

	@Test(priority=3)
	public void registration() {

		Assert.assertTrue(true);
		//write code for registratio process
		Assert.assertTrue(true);
	}

	@Test(priority=4)
	public void closeBrowser() {

		driver.close();
	}
}
