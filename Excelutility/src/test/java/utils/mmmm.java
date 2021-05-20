package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class mmmm {
	FileInputStream file=new FileInputStream("C://Users\\user//eclipse-workspace//apachi poi\\Excelfile/data3.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	//Counting rows
	int rownum=sheet.getLastRowNum();// retuns number of rows
	int colcount=sheet.getRow(0).getLastCellNum(); // returns number of cells present in a row
	
	System.out.println(rownum);
	System.out.println(colcount);
	
	for(int r=0;r<=rownum;r++)
	{
		
		XSSFRow row=sheet.getRow(r);
		
		for(int c=0;c<colcount;c++)
		{
			//XSSFCell cell=row.getCell(c);
			// value=cell.toString();
			String value=row.getCell(c).toString();
			System.out.print(value+"   ");
		}
		
		System.out.println();
		
	}
}

}
