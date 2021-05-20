package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WebTabeDemo extends WebTableBaseClass {
	@Test(priority=1,description="Get the Table Headers")
	public void getTableHeaders()
	{
		setup();
		System.out.println("Get the header of the table");
		List<WebElement> allheadersoftable=driver.findElements(By.xpath(""+xpathString+"/thead/tr/th"));
		System.out.println("Headers in table are below");
		System.out.println("Total headers found:"+allheadersoftable.size());
		for(WebElement headers:allheadersoftable)
		{
			System.out.println(headers.getText());
		}
	}
	@Test(priority=2,description="Count total no of rows and columns")
	public void countRowsAndColoumns()
	{
		setup();
		
		System.out.println("count total number of rows and columns");
		//Total coumns are
		System.out.println("Total coumns"+c.size());
		//Total numbers of rows
		System.out.println("Total numbers of rows+"+r.size());
	}
	@Test(priority=3,description="get th employee possition whose designation is software testing")
	public void getEmpPossition()
	{
		setup();
		System.out.println("=====Get all the employee names for software engineer possition=====");
		for(int i=1;i<=r.size();i++)
		{
			WebElement posColumn=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empPosColumn+"]"));
			if(posColumn.getText().toLowerCase().equalsIgnoreCase(empRole))
			{
				WebElement empNameColumn1=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empNameColumn+"]"));
				System.out.println(empNameColumn1.getText());
			}
		}
		
	}
	@Test(priority=4,description="Get the name of the employee age>40")
	public void getAge()
	{
		setup();
		System.out.println("====get the name of the employeeage>40======");
		for(int i=1;i<=r.size();i++)
		{
			WebElement Agecolumn=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empAgeColumn+"]"));
			if(Integer.parseInt(Agecolumn.getText())>=empAge)
			{
				WebElement empName=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+empNameColumn+"]"));
				System.out.println(empName.getText());
			}
		}
	}
	@Test(priority=5,description="print the last row ")
	
	public void printLastrow()
	{
		setup();
		System.out.println("====print the last row data in the web table====");
		List<WebElement> columnoflastrow=driver.findElements(By.xpath(""+xpathString+"/tbody/tr[last()]/td"));
		for(WebElement e:columnoflastrow)
		{
			System.out.println(e.getText());
		}
		System.out.println();
	}
	@Test(priority=6,description="get cell value")
	public void getcellvalue()
	{
		setup();
		System.out.println("====retrieve the cell value by provoding the column and rows of the webtable");
		WebElement colvalue=driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+rowN+"]/td["+colN+"]"));
		System.out.println("cell value"+colvalue.getText());
	}
	@Test(priority=7,description="get the cell value by custom method")
	public void getcellvalueBycustomeMethod()
	{
		setup();
		System.out.println("====get the cell value by the row and column number using custome method=======");
		System.out.println(getColValue(3,3));
		System.out.println("======");
	}
	@Test(priority=8,description="get the dynamic data")
	public void getcelldatadynamictable()
	{
		setup();
		WebElement dynamic=driver.findElement(By.xpath(""+xpathString+xpathDynamic));
		System.out.println("dynamic coldata:"+dynamic.getText());
	}
	@Test(priority=9,description="get all the table data")
	public void getAllTableData()
	{
		setup();
		System.out.println("===get all the table data====");
		for(int i=1;i<r.size();i++)
		{
			for(int j=1;j<c.size();j++)
			{
				System.out.println(driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
				
			}
			System.out.println();
			System.out.println();
			
		}
	}
	@Test(priority=10,description="get the perticular column  ")
	public void getperticularcol()
	{
		setup();
		System.out.println("get the perticular column");
		for(int i=1;i<=r.size();i++)
		{
			WebElement element= driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+getcolNo+"]"));
			System.out.println(element.getText());
		}
		System.out.println("=================");
		
	}
	@Test(priority=11,description="retrieve more than one column")
    public void retrievemorethanonecolumn()
    {
    	setup();
    	System.out.println("====retrieve more than one column=====");
    	for(int i=1;i<=r.size();i++)
    	{
    		for(int j=1;j<noOfColumns;j++)
    		{
    			System.out.println(driver.findElement(By.xpath(""+xpathString+"/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
    			
    		}
    		System.out.println();
    	}
    }
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
    
}
