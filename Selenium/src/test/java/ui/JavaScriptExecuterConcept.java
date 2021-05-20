package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptExecuterConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("9439466479");
		driver.findElement(By.name("pass")).sendKeys("jagannath");
		//driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		//executeScript
		//what is javascript executor
		//javascriptexecutor is the class and we have to cast our driver into javascript executor.Once it have done 
		//one reference method is executeScript used to execute javascript code.
	
		//loginBtn.click();
		WebElement button=driver.findElement(By.name("login"));
		for(int i=0;i<10;i++)
		{
			js.executeScript("arguments[0].style.border='5px solid green'", button);
		}
		
		

	}
	//public static void flash(WebElement element,WebDriver driver)
	//{
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//String bgcolor=element.getCssValue("backgroundColor");
		//for(int i=0;i<10;i++)
		//{
			//changeColor("red",element,driver);
			//changeColor(bgcolor,element,driver);
			
		//}
	//}
	//public static void changeColor(String color,WebElement element,WebDriver driver)
	//{
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].style.backgroundColor'"+color,element);
		//try
		//{
			//Thread.sleep(2000);
			
		//}catch(InterruptedException e)
		//{}
	//}
	

}
