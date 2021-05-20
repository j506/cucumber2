package ui;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestionDropdown_Bingsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement> list=driver.findElements(By.xpath("//ul//li[@class='sa_sg']//span"));
		System.out.println("size of the auto suggestion:"+list.size());
		for(WebElement listitem:list)
		{
			if(listitem.getText().equals("selenium"))
			
			{
				listitem.click();
				break;
			}
		}
		

	}

}
