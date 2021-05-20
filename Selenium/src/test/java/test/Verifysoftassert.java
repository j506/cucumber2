package test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifysoftassert {
	@Test
	public void verify()
	{
		SoftAssert softassert=new SoftAssert();
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext="Search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle=driver.getTitle();
		System.out.println("verifying the title");
		softassert.assertEquals(actualtitle, expectedtitle,"Test verfication is failed");
		String actualtext=driver.findElement(By.xpath("//*[@id='gh-btn']")).getAttribute("value");
		System.out.println("verifying the text");
		softassert .assertEquals(actualtext, expectedtext, "Test verification failed");
		System.out.println("closing the browser");
		driver.close();
		//if the fisrst testcase is failed then won't proceed further for next testcase for testing.
		softassert.assertAll();
		
	}

}
