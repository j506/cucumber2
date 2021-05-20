package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		String getpagesource=driver.getPageSource();
		System.out.println(getpagesource);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> webelements=driver.findElements(By.xpath("//div[@class='inventory_item']/div"));
		System.out.println(webelements);
		driver.navigate().to("https://www.sugarcrm.com/");		
		String windowhandel=driver.getWindowHandle();
		System.out.println(windowhandel);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[1]/div/div/a")).click();
		driver.navigate().to("https://www.sugarcrm.com/");
		driver.findElement(By.xpath("//*[@id=\"mega-menu-item-44\"]/a/span")).click();
		Set<String> windowhandels=driver.getWindowHandles();
		System.out.println(windowhandels);
		
		driver.navigate().to("https://google.com");
		
		driver.close();
		
	

		

	}

}
