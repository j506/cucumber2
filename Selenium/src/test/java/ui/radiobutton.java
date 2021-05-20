package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {
	WebDriver driver;
	public void lunch()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	}
	public void demo()
	{
	    WebElement radio=driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"Male\"]"));
	    radio.click();
	    System.out.println("the radio button is selected"+radio.isSelected());
	}
	public void checkbox(String hobby)
	{
		//WebElement checkbox=driver.findElement(By.xpath("//input[@type=\"checkbox\" and @value=\"Drawing\"]"));
		//checkbox.click();
		List<WebElement> list=driver.findElements(By.xpath("//input[@type=\"checkbox\" and @name=\"Hobby\"]"));
		int listsize=list.size();
		for(int i=0;i<listsize;i++)
		{
			WebElement ele=list.get(i);
			String hobbies=ele.getAttribute("value");
			System.out.println(hobbies);
			if(hobbies.contains(hobby)) {
				ele.click();
				break;
			}
			
		}
	}
	public void closebrwser()
	{
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radiobutton obj=new radiobutton();
		obj.lunch();
		obj.demo();
		obj.checkbox("Dancing");
		//obj.closebrwser();
	

	}

}
