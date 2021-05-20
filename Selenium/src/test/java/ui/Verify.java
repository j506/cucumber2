package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {
	@Test
	public void verify()
	{
		String expectedtitle="Electronics, Cars,df Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
	}

}
