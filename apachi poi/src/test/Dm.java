package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C://Users\\\\user//eclipse-workspace//apachi poi\\\\Excelfile/data3.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//counting no of rows
		int countrows=sheet.getLastRowNum();
		int countcols=sheet.getRow(0).getLastCellNum();
		System.out.println(countrows);
		System.out.println(countcols);
		for(int r=0;r<=countrows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<countcols;c++)
			{
				//XSSFCell cell=row.getCell(c);
				//String value=cell.toString();
				String value=row.getCell(c).toString();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		
		
		

	}

}
