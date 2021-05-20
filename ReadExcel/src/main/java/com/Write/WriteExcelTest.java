package com.Write;

import org.testng.annotations.Test;

public class WriteExcelTest {
	
	
	 WriteExcel obj= new WriteExcel();
	 
	 @Test
	 public void writeExcelTest() throws Exception {
	  obj.writeExcel("Test", "Male", 0, 2);
	 }
	 
	 @Test
	 public void writeExcelTest1() throws Exception {
	  obj.writeExcel("Test", "Female", 1, 2);
	 }
}
