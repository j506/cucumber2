package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascripte {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		//print the title of the page
		Thread.sleep(2000);
		String script="return document.title;";
		Thread.sleep(2000);
		String title=(String) js.executeScript(script);
		Thread.sleep(2000);
		System.out.println(title);
		Thread.sleep(2000);
		//click the button
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		js.executeScript("myFunction()");
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("jagannath");
				
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		//heighlight the button
		WebElement button=driver.findElement(By.xpath("/html/body/button"));
		
		js.executeScript("arguments[0].style.border='5px solid green'", button);
		//scroll page
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certfiedbutton=driver.findElement(By.xpath("//*[@id=\"certsection\"]/p/a"));
		js.executeScript("arguments[0].scrollIntoView(true);", certfiedbutton);

	}

}
