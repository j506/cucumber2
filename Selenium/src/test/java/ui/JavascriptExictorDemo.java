package ui;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExictorDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//syntax
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript(Script, args);
		//uses of javascriptexecutor
        //flash:suppose we have an element the wepage i want to keep on flashing those element
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		Javascriptutil.flash(logo, driver);
		//draw thw border and take the screenshot
		/*WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		Thread.sleep(3000);
		Javascriptutil.drawBorder(logo, driver);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshot\\logo.png");
		FileUtils.copyFile(src, trg);*/
		
		//capture the title of the page
		//String title=Javascriptutil.getTitleByjs(driver);
		//System.out.println(title);
		//to perform the click action also we use javascriptexecutor
		//WebElement regclick=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		//Javascriptutil.ClickElementByjs(regclick, driver);
		//generate an alert
		//Javascriptutil.generatealert(driver, "this is my message..");
		//refreshing the page
		//Javascriptutil.refreshBrowserByjs(driver);
		//scroll down 
		//Javascriptutil.scrollPageDown(driver);
		//Thread.sleep(4000);
		//and scroll up
		//Javascriptutil.scrollPageUp(driver);
		
		//Zoom page
		Javascriptutil.ZoomPage(driver);
		
	}

}
