package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowndemo1 {
	public WebDriver driver;
	public void lunch()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	}


    public void dropDownDemo() {



         WebElement bDay = driver.findElement(By.id("Birthday_Day"));

         WebElement bMonth = driver.findElement(By.id("Birthday_Month"));

         WebElement bYear = driver.findElement(By.id("Birthday_Year"));



         Select selectDay = new Select(bDay);

         Select selectMonth = new Select(bMonth);

         Select selectYear = new Select(bYear);



         selectDay.selectByIndex(8); // 4

        

         selectMonth.selectByValue("March");
         selectMonth.selectByValue("April");
        
         List<WebElement> list=selectMonth.getOptions();
         for(int i=0;i<list.size();i++)
         {
        	 System.out.println(list.get(i).getText());
         }
         

         selectYear.selectByVisibleText("1996");
         //how to get first selected item
         WebElement firstselecteditem=selectMonth.getFirstSelectedOption();
         System.out.println(firstselecteditem.getText());

        


    }
  



    public void tearDown() {

         driver.close();

    }


         public static void main(String[]args){



         DropDowndemo1 obj = new DropDowndemo1();

         obj.lunch();

         obj.dropDownDemo();

         obj.tearDown();

    }
}
