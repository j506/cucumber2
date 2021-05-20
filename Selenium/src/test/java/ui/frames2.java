package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		WebElement frame1=driver.findElement(By.id("iframeResult"));
	    driver.switchTo().frame(frame1);
	    WebElement frame=driver.findElement(By.xpath("/html/body/button"));
	    frame.click();
	    Alert alotonpage=driver.switchTo().alert();
	    
	    alotonpage.sendKeys("jagannath");
	    alotonpage.accept();
	    
	    
	  
		
	
		
		

	}

}
