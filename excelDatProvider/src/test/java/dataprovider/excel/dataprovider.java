package dataprovider.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	DataFormatter formatter=new DataFormatter();
	@Test(dataProvider="driverTest")
	
	public void testcasedata(String text,String Communication,String id)
	{
		System.out.println(text+Communication+id);
	}
	@DataProvider(name="driverTest")
	public Object[][] getdata() throws IOException 
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
				XSSFCell cell=row.getCell(j);
				
				data[i][j]=formatter.formatCellValue(cell);
			}
		}
		return data;
		
		
		
		
		
		
		//return data;
	}

}
