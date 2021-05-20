package learnjava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Handelingwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		Set<String> windowhandels=driver.getWindowHandles();
		System.out.println(windowhandels);
		Iterator<String> iterator=windowhandels.iterator();
		String parentwindow=iterator.next();
		String childwindow=iterator.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("jagannath");
		driver.switchTo().window(parentwindow);
		

	}

}
