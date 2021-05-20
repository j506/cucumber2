package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalllinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/essentials/");
		driver.manage().window().maximize();
		List<WebElement>alllink=driver.findElements(By.tagName("option"));
		System.out.println("print total no of size"+alllink.size());
		for(int i=0;i<alllink.size();i++)
		{
			System.out.println("total tags"+alllink.get(i).getAttribute("value"));
			
		}
		
		

		
         
	
		

		
		

	}

}
