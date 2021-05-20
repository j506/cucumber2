package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandel3 {
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/p/java-qa.html");
		String parentWinID=driver.getWindowHandle();
		System.out.println(parentWinID);
		//driver.findElement(By.id("windowhandling1")).click();
		//driver.findElement(By.id("windowhandling1")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Java Questions Part1 - Basic Questions')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Java Questions Part2 - OOPS Concept, Constructors,')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Java Questions Part7 - Array and Matrix Program')]")).click();
		System.out.println("All win are:");
		Set<String> allwinID=driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(allwinID);
		driver.switchTo().window(list.get(0));
		driver.close();
		
	
		
		
	}
	

}
