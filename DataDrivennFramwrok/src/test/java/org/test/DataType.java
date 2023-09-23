package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataType {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\DataDrivennFramwrok\\src\\main\\resources\\Book.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("sheet1");
		for (int i = 1; i < 4; i++) {
			Row r0 = s.getRow(i);
			
			for (int j = 0; j < 4; j++) {
				Cell c = r0.getCell(j);
			
		int type = c.getCellType();
		//string---->1
		//num------->0
		
		if (type==1) {
			String value = c.getStringCellValue();
			System.out.println(value);
		} 
		else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			System.out.println(da);
			SimpleDateFormat ss = new SimpleDateFormat("dd-MM-YYYY");
			String myFormat = ss.format(da);
			System.out.println(myFormat);
		} 
		else {
			double no = c.getNumericCellValue();
			long l = (long) no;
			String number = String.valueOf(l);
			System.out.println(number);
			int len = number.length();
			
		}
		
	}

		}}}
