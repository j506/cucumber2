package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		
		WebElement From=driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']"));
		Thread.sleep(2000);
		From.clear();
		Thread.sleep(2000);
		
		From.sendKeys("ABC");
		Thread.sleep(2000);
		From.sendKeys(Keys.);
		Thread.sleep(2000);
		From.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.cssSelector("input[id='gosuggest_inputDest']"));
		Thread.sleep(2000);
		element.clear();
		Thread.sleep(2000);
		element.sendKeys("XYZ");
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
			element.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
		}
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		

	}

}
