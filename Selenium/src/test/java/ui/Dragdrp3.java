package ui;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Learning DHTMLX Suite UI')]"));
		WebElement element1=driver.findElement(By.xpath("//li[contains(text(),'Ajax in Practice')]"));
		action.clickAndHold(element).pause(Duration.ofSeconds(2)).moveToElement(element1).pause(Duration.ofSeconds(2)).release().build().perform();
		
		
		
	
		
		

	}
}

