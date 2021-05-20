package jaga;

import java.io.File;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class Jaga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSSFSheet sheet=new HSSFSheet();
		HSSFSheet sheet=workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("world");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("hello");
		sheet.getRow(1).createCell(1).setCellValue("world");
		File file=new File("");
		workbook.write(file);
		workbook.close();

}
