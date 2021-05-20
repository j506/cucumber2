package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[5]/div/p")).click();
		driver.findElement(By.xpath("//*[@id=\"departureCalendar\"]")).click();
		Thread.sleep(5000);
		String flag="False";
		while(flag=="False")
		{
			Thread.sleep(2000);
			if(driver.findElements(By.xpath("//*[@id=\"fare_20210420\"]")).size()>0)
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"fare_20210420\"]")).click();
				flag="True";
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span")).click();
			}
		}
		//driver.findElement(By.xpath("//*[@id=\"fare_20210320\"]")).click();
		System.out.println("test is passed");
		driver.close();
		

	}

}
