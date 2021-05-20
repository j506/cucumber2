package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alrt=driver.switchTo().alert();
		System.out.println(alrt.getText());
		String text=alrt.getText();
		if(text.equalsIgnoreCase("Please enter a valid user name"))
		{
			System.out.println("correct alert message");
		}
		else
		{
			System.out.println("in-correct alert message");
		}
		alrt.accept();
		

	}

}
