package com.WriteTestcases;

import org.testng.annotations.Test;

import com.utility.NewExcelLibrary;

public class ExcelTest {
	 NewExcelLibrary obj=new  NewExcelLibrary("C:\\Users\\user\\eclipse-workspace\\WriteTest\\TestData\\TestData1.xlsx");
	@Test(priority=1)
	public void testcase1()
	{
		int totalRows=obj.getRowCount("Sheet1");
		System.out.println("Total rows:"+totalRows);
	}
	@Test(priority=2)
	public void testcase2()
	{
		String salary=obj.getCellData("Sheet1","Salary", 4);
		System.out.println("salary"+salary);
		
	}
	@Test(priority=3)
	public void testcase3()
	{
		String rating=obj.getCellData("Sheet1", 4, 2);
		System.out.println("rating"+rating);
		int a=1;
		Double sum=Double.valueOf(rating)+a;
		System.out.println("the rating now"+sum);
		
	}
	@Test(priority=4)
	public void testcase4()
	{
		obj.setCellData("Sheet1", "ID", 2, "105");
	}
	@Test(priority=5)
	public void testcase5()
	{
		boolean flag=obj.removeSheet("Newsheet");
		System.out.println(flag);
	}
	

}
