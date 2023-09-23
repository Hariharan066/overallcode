package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreate {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\DataDrivennFramwrok\\src\\main\\resources\\excel.xlsx");
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("sheet1datas");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("hari");
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		
		System.out.println("------done------");
		
		

	}

}
