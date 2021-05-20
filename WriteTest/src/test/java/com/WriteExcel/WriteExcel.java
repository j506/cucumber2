package com.WriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	public void writeExcel(String sheetName,String cellValue,int row,int col) throws Exception
	{
		String excelPath1="C:\\Users\\user\\eclipse-workspace\\WriteTest\\TestData\\TestData1.xlsx";
		File file= new File(excelPath1);
		  
		  FileInputStream fis= new FileInputStream(file);
		  
		  XSSFWorkbook wb= new XSSFWorkbook(fis);
		  
		  XSSFSheet sheet= wb.getSheet(sheetName);
		  
		  sheet.getRow(row).createCell(col).setCellValue(cellValue);
		  
		  FileOutputStream fos= new FileOutputStream(new File(excelPath1));
		  
		  wb.write(fos);
		  
		  wb.close();
		  
		  fos.close();
	}

}
