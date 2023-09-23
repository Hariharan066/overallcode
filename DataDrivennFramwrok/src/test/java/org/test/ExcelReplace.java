package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReplace {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\DataDrivennFramwrok\\src\\main\\resources\\excel.xlsx");

		FileInputStream fi = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("sheet1datas");
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		
		//way1
	//	String s1 = c.getStringCellValue();
		//way2
		String s2 = c.toString();
		
		if (s2.equals("its my name")) {
			
			FileOutputStream fo = new FileOutputStream(f);
			c.setCellValue("k");
			w.write(fo);
			
			System.out.println("-----done----");
			
		}
	}

}
