package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement sourceText=driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
		Actions action=new Actions(driver);
		action.keyDown(sourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement ExpectedTextarea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[4]/pre/span"));
		action.keyDown(ExpectedTextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		
		

	}

}
