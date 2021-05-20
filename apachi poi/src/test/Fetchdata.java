package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetchdata {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\user\\eclipse-workspace\\apachi poi\\Excelfile\\Test3.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int colcount=row.getPhysicalNumberOfCells();
			for(int j=0;j<=colcount;j++)
			{
				XSSFCell cell=row.getCell(j);
				String cellvalue=getcellvalue(cell);
				System.out.println("||"+cellvalue);
				
				
			}
			System.out.println();
		}
		//String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(cellvalue);
		workbook.close();
		fis.close();
		

	}
	public static String getcellvalue(XSSFCell cell) {
	switch(cell.getCellType()) {
	case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
	case BOOLEAN:
		return String.valueOf(cell.getBooleanCellValue());
	case STRING:
		return cell.getStringCellValue();
	default:
		return cell.getStringCellValue();
		
	}
	
	
	}

}
