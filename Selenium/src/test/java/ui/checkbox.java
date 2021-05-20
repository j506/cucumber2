package ui;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		WebElement radio=driver.findElement(By.xpath("//input[@id='doi0']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		driver.findElement(By.xpath("//input[@name='interest_market_c']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='interest_market_c']")).click();
		
		List<WebElement> d=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(d.size());
		for(int i=0;i<d.size();i++)
		{
			System.out.println(d.get(i).getAttribute("type"));
		}
		
		
		
		//driver.findElement(By.xpath("/html/body/div/div[5]/div/div[2]/div/div/div[2]/form/div/div/input")).sendKeys("jagannath");

		

	}
	public static void c()
	{
		driver.
	}
   
}
