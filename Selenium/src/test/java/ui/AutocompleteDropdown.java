package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath(" //a[contains(text(),'Live Posting')]")).click();
		WebElement searchbox=driver.findElement(By.id("autocomplete"));
		searchbox.clear();
		searchbox.sendKeys("Toronoto");
		String text;
		do
		{
			searchbox.sendKeys(Keys.ARROW_DOWN);
			text=searchbox.getAttribute("value");
			if(text.equals("Toronto, OH, USA"))
			{
				searchbox.sendKeys(Keys.ENTER);
				break;
			}
		}while(!text.isEmpty());

	}

}
