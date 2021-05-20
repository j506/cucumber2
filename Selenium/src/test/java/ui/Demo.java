package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement des=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions element=new Actions(driver);
		element.dragAndDrop(source, des).build().perform();
		
		
		

	}

}
