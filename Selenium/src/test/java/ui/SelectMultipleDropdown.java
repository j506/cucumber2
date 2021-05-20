package ui;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleDropdown {
	public WebDriver driver;
	public void lunch()
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\browserdriver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	}
    public void dropDownDemo() throws Throwable   {



        WebElement multiselectCity = driver.findElement(By.id("multi-select"));

       



        Select selectCity = new Select(multiselectCity);

        //Select selectMonth = new Select(bMonth);

        //Select selectYear = new Select(bYear);
       



        selectCity.selectByIndex(0); // 4
        

       

        selectCity.selectByValue("Florida");
        Thread.sleep(5000);
        
       
       
        

        selectCity.selectByVisibleText("New York");
        Thread.sleep(3000);
        selectCity.selectByValue("Ohio");
        Thread.sleep(3000);
        //selectCity.deselectByValue("Ohio");
        //selectCity.deselectByVisibleText("New York");
        
        //how to get first selected item
        //WebElement firstselecteditem=selectMonth.getFirstSelectedOption();
        //System.out.println(firstselecteditem.getText());
        List<String> expectedList=new ArrayList<String>();
        expectedList.add("California");
        expectedList.add("Florida");
        expectedList.add("New York");
        expectedList.add("");
        List<String> actualList=new ArrayList<String>();
        
        List<WebElement> selectedoption=selectCity.getAllSelectedOptions();
        int getoptions=selectedoption.size();
        for(int i=0;i<getoptions;i++)
        {
        	actualList.add(selectedoption.get(i).getText());
        	System.out.println(selectedoption.get(i).getText());
        }
        boolean result=actualList.equals(expectedList);
        System.out.println("The result of comparion is:"+result);
        		

       


   }
 



   public void tearDown() {

        driver.close();

   }


	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		SelectMultipleDropdown obj=new SelectMultipleDropdown();
		obj.lunch();
		obj.dropDownDemo();
		obj.tearDown();

	}

}
