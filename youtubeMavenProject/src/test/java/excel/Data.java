package excel;




import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    FileOutputStream file=new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\youtubeMavenProject\\test5.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("data");
        
        for(int i=0;i<=5;i++)
        {
        	XSSFRow row=sheet.createRow(i);
        	for(int j=0;j<=3;j++)
        	{
        		row.createCell(j).setCellValue("Welcome");
        	}
        }
        workbook.write(file);
        System.out.println("data is created in completed");
	}

}
