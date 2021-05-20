package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement From=driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);
		From.sendKeys("Sydney");
		Thread.sleep(2000);
		From.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		From.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
		

	}

}
