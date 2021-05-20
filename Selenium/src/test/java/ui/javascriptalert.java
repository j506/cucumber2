package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    WebElement frame=driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	    driver.switchTo().frame(frame);
	    
	    driver.findElement(By.xpath("/html/body/button")).click();
	    Alert alert=driver.switchTo().alert();
	    alert.sendKeys("jagannath");
	    alert.accept();
	    
	    
		

	}

}
