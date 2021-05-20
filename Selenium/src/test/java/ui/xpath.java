package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		//driver.findElement(By.xpath("/html/body/div/div[5]/div/div[2]/div/div/div[2]/form/div/div/input")).sendKeys("jagannath");
		driver.findElement(By.cssSelector("#first_name")).sendKeys("jagannath");
		driver.findElement(By.xpath("/html/body/div/div[5]/div/div[2]/div/div/div[2]/form/div/div[2]/input")).sendKeys("moharana");
		WebElement s=driver.findElement(By.xpath("//input[contains(@name,'user[email]')]"));
				s.sendKeys("jagannathmoharana96@gmail.com");
		driver.findElement(By.xpath("//input[@type='text' and @name='user[company]']")).sendKeys("jaga@123");
		driver.findElement(By.xpath("//select[@name='user[country]']//child::option[3]")).click();
		driver.findElement(By.xpath("//select[@name='user[job_role]']//child::option[2]")).click();
		

	}

}
