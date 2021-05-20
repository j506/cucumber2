package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	WebDriver driver;
	String xpathString="//table[@id='example']";
	List<WebElement> r;
	List<WebElement> c;
	
	int empposcol=2;
	int empnamecol=1;
	String designation="Software Engineer";
	int empage1=40;
	int empcol=4;
	int rown=2;
	int coln=3;
	
	public void setup()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		r=driver.findElements(By.xpath(""+xpathString+"/tbody/tr"));
		c=driver.findElements(By.xpath(""+xpathString+"/thead/tr/th"));
		
	}
	

}
