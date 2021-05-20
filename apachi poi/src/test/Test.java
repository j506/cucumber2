package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static class CreateExcel
	{
		public static void main(String[] args) throws Exception  
		{
			//HSSFWorkbook workbook=new HSSFWorkbook();
			//HSSFSheet sheet=workbook.createSheet("TestSheet");
			//sheet.createRow(0);
			//sheet.getRow(0).createCell(0).setCellValue("hello");
			//sheet.getRow(0).createCell(1).setCellValue("world");
			//sheet.createRow(1);
			//sheet.getRow(1).createCell(0).setCellValue("hello");
			//sheet.getRow(1).createCell(1).setCellValue("world");
			//File file=new File("C:\\Users\\user\\eclipse-workspace\\apachi poi\\Excelfile\\Test1.xls");
			//workbook.write(file);
			//workbook.close();
			XSSFWorkbook workbook=new 	XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("TestSheet2");
			sheet.createRow(0);
			sheet.getRow(0).createCell(0).setCellValue("hello");
			sheet.getRow(0).createCell(1).setCellValue("world");
			sheet.createRow(1);
			sheet.getRow(1).createCell(0).setCellValue("hello");
			sheet.getRow(1).createCell(1).setCellValue("world");
			File file=new File("C:\\Users\\user\\eclipse-workspace\\apachi poi\\Excelfile\\Test3.xlsx");
			FileOutputStream fos=new FileOutputStream(file);
			workbook.write(fos);
			workbook.close();
			
			
		}
	}

}
