package com.WriteExcel;

import org.testng.annotations.Test;

import com.readExcel.ExcelLibrary;

public class ReadExcelSheet {
	@Test
	public void ReadExcel() throws Exception
	{
		ExcelLibrary obj=new ExcelLibrary();
		String dataString=obj.readData("Test", 5, 1);
		System.out.println(dataString);
	}

}
