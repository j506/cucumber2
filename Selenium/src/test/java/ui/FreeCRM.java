package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class FreeCRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		Actions action=new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).perform();
		//driver.findElement(By.xpath("//a[contains(text(),'SpiceMAX')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[18]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();

	}

}
