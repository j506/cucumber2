package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement we=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		WebElement we1=driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span"));
		Actions action=new Actions(driver);
		action.moveToElement(we).moveToElement(we1).click().build().perform();
		
		
		

	}

}
