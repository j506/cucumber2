package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement googleSearch=driver.findElement(By.name("q"));
		Actions act=new Actions(driver);
		Action action=act.keyDown(googleSearch, Keys.SHIFT).sendKeys("selenium").keyUp(googleSearch, Keys.SHIFT)
		.keyDown(googleSearch, Keys.CONTROL).sendKeys("a")
		.keyDown(googleSearch, Keys.CONTROL).sendKeys("x")
		.keyDown(googleSearch, Keys.CONTROL).sendKeys("v")
		.build();
		action.perform();
		

	}

}
