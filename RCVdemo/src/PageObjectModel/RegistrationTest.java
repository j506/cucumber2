package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/newtours/");
	}
	@Test
	public void userRegistartion()
	{
		RegistrationPage RGPage=new RegistrationPage(driver);
		RGPage.clickRegLink();
		RGPage.setFirstName("jagannath");
		RGPage.setLastName("moaharana");
		RGPage.setPhone("9439466479");
		RGPage.setemail("jagannathmoharana96@gmail.com");
		RGPage.setAddress1("cuttack");
	
		RGPage.setCity("Angul");
		RGPage.setState("Odisha");
		RGPage.setPostalCode("759145");
		RGPage.setCountry("INDIA");
		RGPage.setUserName("jagannath");
		RGPage.setPassword("jagannath");
		RGPage.setConfirmedPassword("jagannath");
		RGPage.clickRegBtn();
		if (driver.getPageSource().contains("Thank you for registering")) {
			Assert.assertTrue(true); 
}

else {
		Assert.fail();
	}

	}

}
