package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement frame=driver.findElement(By.cssSelector("iframe[id='singleframe']"));
		driver.switchTo().frame(frame);
		WebElement textbox=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		textbox.sendKeys("selenium");
		driver.switchTo().defaultContent();
		WebElement secondtab=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		secondtab.click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement textbox1=driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]"));
		textbox1.sendKeys("selenium");
		
		

	}

}
