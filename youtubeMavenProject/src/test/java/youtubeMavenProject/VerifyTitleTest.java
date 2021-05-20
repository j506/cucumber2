package youtubeMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
	public void titletest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}

}
