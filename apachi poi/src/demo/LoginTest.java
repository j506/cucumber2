package demo;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		String path="C://SeleniumPractice/Login1.xlsx";
		
		int rows=utils.getRowCount(path, "Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
		String username=utils.getCellData(path,"Sheet1",i, 0);
		String password=utils.getCellData(path, "Sheet1",i, 1);
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		
		if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
		{
			System.out.println(" test passed");
			utils.setCellData(path,"Sheet1", i, 2, "Passed");
			
		}
		else
		{
			System.out.println(" test failed");
			utils.setCellData(path,"Sheet1", i, 2, "Failed");
		}
		
		driver.findElement(By.linkText("Home")).click();
		}
		
		driver.close();
	}
}