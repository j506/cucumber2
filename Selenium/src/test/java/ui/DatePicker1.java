package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://calendar.google.com/calendar/u/0/r?mode=week");
		String flag="False";
		while(flag=="False")
		{
			if(driver.findElements(By.xpath("//*[@id=\"drawerMiniMonthNavigator\"]/div/div[2]/div[2]/div[2]/span[6]/div")).size()>0);
			{
				driver.findElement(By.xpath("//*[@id=\\\"drawerMiniMonthNavigator\\\"]/div/div[2]/div[2]/div[2]/span[6]/div")).click();
				flag="True";
			}
			driver.findElement(By.xpath("//*[@id=\"drawerMiniMonthNavigator\"]/div/div[1]/div[2]/span/span")).click();
			
		}
		System.out.println("test is passed");
		driver.close();

	}

}
