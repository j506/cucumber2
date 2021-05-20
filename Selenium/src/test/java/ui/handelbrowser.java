package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handelbrowser {
	public static void main(String[]arg)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//i want to get the id of the browser window
		//getWindowHandle()
		String windowID=driver.getWindowHandle();//this will return id of the single browser window
		System.out.println(windowID);//15
		driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
		//getWindowHandles()
		Set<String> windowIDs=driver.getWindowHandles();
		
		//first method-iterator
		/*Iterator<String> it=windowIDs.iterator();
		String parentWindowId=it.next();
		String childWindowID=it.next();
		
		System.out.println("parentswindowID of browser window"+parentWindowId);
		System.out.println("childwindowID of browser window"+childWindowID);*/
		//Secound method-List/ArrayList
		List<String> windowsIDlist=new ArrayList(windowIDs);//converting set to list
		/*String parentwindowId=windowsIDlist.get(0);//parent window id
		String childwindowId=windowsIDlist.get(1);//child window id
		
		System.out.println("parent window id"+parentwindowId);
		System.out.println("child window id"+childwindowId);
		//How to use widowsid for switching
		driver.switchTo().window(parentwindowId);
		System.out.println("Parent windows title"+driver.getTitle());
		driver.switchTo().window(childwindowId);
		System.out.println("Child windows title"+driver.getTitle());*/
		//for each loop
		/*for(String wid:windowsIDlist)
		{
			//System.out.println(wid);
			String title=driver.switchTo().window(wid).getTitle();
			System.out.println(title);
		}
		driver.close();//close method is using o close sigle browser window driver which pinting 
		driver.quit();//close all the browser windows*/
		for(String wid:windowsIDlist)
		{
			String title=driver.switchTo().window(wid).getTitle();
			if(title.equals("HR Management System | HR Management Software | OrangeHRM"))
			{
				driver.close();
			}
		}
		
		
		
		
		
		
		
	}

}
