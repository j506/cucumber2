package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangeHRM.pages.LoginPage;

public class WebTableBaseClass {
	WebDriver driver;
	String xpathString="//table[@id='example']";
	List<WebElement> c;
	List<WebElement> r;
	
	String empRole="Software Engineer";
	int empPosColumn=2;
	int empNameColumn=1;
	
	int empAge=40;
	int empAgeColumn=4;
	
	int rowN=2;
	int colN=3;
	
	String xpathDynamic="/tbody/tr/td[contains(text(),'B. Wagner')]";
	int getcolNo=1;
	
	int noOfColumns=6;
	
	public String getColValue(int row, int col)
	{
		WebElement colvalue=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+row+"]/td["+col+"]"));
		return colvalue.getText();
		
	}
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
			
		driver=new ChromeDriver();
		    
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		c=driver.findElements(By.xpath(""+xpathString+"/thead/tr/th"));
		r=driver.findElements(By.xpath(""+xpathString+"/tbody/tr"));
		
		
		
	}
}
