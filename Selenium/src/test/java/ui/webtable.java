package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		//////*[@id="home_top_five"]/div/div/div/div[1]/table/tbody/tr[1]/td
		////*[@id="home_top_five"]/div/div/div/div[1]/table/tbody/tr[1]/td
		List<WebElement> rowelements=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		
		
	}

}
