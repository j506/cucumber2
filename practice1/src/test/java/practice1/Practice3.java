package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Practice3 extends Practice2{
	@Test(priority=1,description="get the all headers of the web table")
	public void getheaderofTable()
	{
		setup();
		List<WebElement> allheaderoftable=driver.findElements(By.xpath(""+xpathString+"/thead/tr/th"));
		System.out.println("Total headers size"+allheaderoftable.size());
		for(WebElement s:allheaderoftable)
		{
			System.out.println(s.getText());
		}
	}
	@Test(priority=2,description="count no of rows and coulmns")
	public void getCount()
	{
		setup();
		System.out.println("count no of  rows:"+r.size());
		System.out.println("count no of columns:"+c.size());
	}
	@Test(priority=3,description="get the emplyee name for software possition")
	public void getemployeename()
	{
		setup();
		System.out.println("======get the employee name for software testing posstion");
		for(int i=1;i<=r.size();i++)
		{
			WebElement emppos=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empposcol+"]"));
			if(emppos.getText().toLowerCase().equalsIgnoreCase(designation))
			{
				WebElement empcol1=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empnamecol+"]"));
				System.out.println(empcol1.getText());
			}
		}
	}
	@Test(priority=4,description="get the emp name gage is greater than 40")
	public void getAge()
	{
		setup();
		System.out.println("get the name of the person who age is age>40");
		for(int i=1;i<=r.size();i++)
		{
			WebElement age=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empcol+"]"));
			if(Integer.parseInt(age.getText())>=empage1)
			{
				WebElement text=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empnamecol+"]"));
				System.out.println(text.getText());
			}
		}
		
	}
	@Test(priority=5,description="print the last row")
	public void printlastrow()
	{
		setup();
		List<WebElement> lastrow=driver.findElements(By.xpath(""+xpathString+"/tbody/tr[last()]/td"));
		for(WebElement e:lastrow)
		{
			System.out.println(e.getText());
		}
	}
	@Test(priority=6,description="get perticular cell data in the table")
	public void getcelldata()
	{
		setup();
		WebElement celldata=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+rown+"]/td["+coln+"]"));
		System.out.println(celldata.getText());
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
