package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
    static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium\\src\\test\\java\\ui\\config.properties");
        prop.load(ip);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
       
        String browsername=prop.getProperty("browser");
        System.out.println(browsername);
        String url=prop.getProperty("URL");
        String url1=prop.getProperty("URL1");
        System.out.println(url);
        System.out.println(url1);
        if(browsername.equals("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
    	    driver=new ChromeDriver();
     		 
        }
        
        else if(browsername.equals("FF"))
        {
        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
    	    driver=new FirefoxDriver();
        }
        Thread.sleep(2000);
        driver.get(url);
        driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
        driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
        driver.findElement(By.id("emailid_locator")).sendKeys("emialid");
        driver.findElement(By.id("password_locator")).sendKeys("password");
        
        
        
        
	}

}
