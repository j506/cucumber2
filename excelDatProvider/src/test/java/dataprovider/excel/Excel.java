package dataprovider.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	@Test
	public object[][] getExcel() throws IOException 
	{
		//Object[][] data= {{"hello","text",1},{"bye","message",143},{"solo","call",453}};
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\excelDatProvider\\excel\\excelDriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row= sheet.getRow(0);
		int colcount=row.getLastCellNum();
		System.out.println(colcount);
		Object data[][]=new Object[rowCount-1][colcount];
		for(int i=0;i<rowCount-1;i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0;j<colcount;j++)
			{
			      data[i][j]=row.getCell(j);
			}
		}
		return data;
		
	}
}
