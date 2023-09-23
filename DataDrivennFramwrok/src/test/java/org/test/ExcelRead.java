package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	

	public static void main(String[] args) throws IOException {
	//file loction	
		File f=new File("C:\\Users\\Lenovo\\eclipse-workspace\\DataDrivennFramwrok\\src\\main\\resources\\Book.xlsx");
	//Excel---Convert
		FileInputStream fi = new FileInputStream(f);
		
		Workbook w =new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("sheet1");
	
		for (int i = 1; i <4; i++) {
			Row r = s.getRow(i);
		
		for (int j = 0; j <4; j++) {
			Cell c = r.getCell(j);
			
			System.out.println(c);
			
		}
		System.out.println("--------------");   
		}
		   
		   
	
		
		
		
		
		
		
	
	}

}
