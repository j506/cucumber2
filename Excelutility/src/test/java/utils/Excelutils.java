package utils;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	public static void main(String[]arg) throws IOException 
	{
		getRowCount();
		getCellData();
	}
	public static void getCellData() throws IOException
	{
		
		String excelPath="./data/TestData.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		String value=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
	}
	public static void getRowCount() 
	
	{ 
		try {
		
		String excelPath="./data/TestData.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows:"+rowCount);
		}catch(Exception exe){
			System.out.println(exe.getCause());
			System.out.println(exe.getMessage());
			exe.printStackTrace();
		}
	}
		
		
		
		


	

}
