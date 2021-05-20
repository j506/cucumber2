package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandel2 {
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parentWinID=driver.getWindowHandle();
		System.out.println(parentWinID);
		//driver.findElement(By.id("windowhandling1")).click();
		//driver.findElement(By.id("windowhandling1")).click();
		System.out.println("All win are:");
		Set<String> allwinID=driver.getWindowHandles();
		System.out.println(allwinID.size());
		for(String allIDs:allwinID)
		{
		     System.out.println(allIDs);	
		}
		//driver.quit();
		Iterator<String> itr=allwinID.iterator();
		while(itr.hasNext())
		{
			String childwinID=itr.next();
			if(!parentWinID.equalsIgnoreCase(childwinID))
			{
				driver.switchTo().window(childwinID);
				System.out.println("get the currentURl:"+driver.getCurrentUrl());
				System.out.println("get the currentTitle:"+driver.getTitle());
				//driver.findElement(By.id("searchInput")).sendKeys("Selenium Tuterial");
				driver.close();
			}
		}
		driver.switchTo().window(parentWinID);
		driver.quit();
		
		
	}
	

}
