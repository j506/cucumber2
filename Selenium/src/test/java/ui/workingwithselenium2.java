package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwithselenium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		WebElement webelemt=driver.findElement(By.name("employees_c"));
		Select select=new Select(webelemt);
		WebElement firstoption=select.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		select.selectByValue("level5");
		Thread.sleep(2000);
	    select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByVisibleText("251 - 500 employees");
		Thread.sleep(2000);
		//WebElement webelemt=driver.findElement(By.id("multi-select"));
		//Select select=new Select(webelemt);
		//select.selectByValue("California");
		//select.selectByIndex(5);
		//List<WebElement> allitems=select.getAllSelectedOptions();
		//System.out.println(allitems.size());
		//select.deselectAll();
		//select.selectByValue("California");
		//select.selectByIndex(5);
		//select.deselectByIndex(5);
		//List<WebElement> allitems1=select.getAllSelectedOptions();
		//System.out.println(allitems1.size());
		
         
	
		
		
		//
		//driver.findElement(By.xpath("/html/body/div/div[5]/div/div[2]/div/div/div[2]/form/div/div/input")).sendKeys("jagannath");
		
		

	}

}
