package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li//a"));
		for(int i=0;i<options.size();i++)
		{
			String values=options.get(i).getText();
			if(values.equals("CONTACT US"))
			{
				options.get(i).click();
				break;
			}
		}
		if(true)
		{
			driver.close();
			System.out.println("pass");
		}
			
		
	}

}
