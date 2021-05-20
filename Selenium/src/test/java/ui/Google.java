package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
        List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div//span"));
        System.out.println(list.size());
        for(WebElement listitems:list)
        {
        	if(listitems.getText().contains("download"))
        	{
        		listitems.click();
        		break;
        	}
        }
	}

}
