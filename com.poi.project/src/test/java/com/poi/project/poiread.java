package com.poi.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class poiread {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File f = new File ("C:\\Users\\k.lakshmi.sheela\\Desktop\\POI.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("first Sheet");
		Row r = sht.getRow(0);
		Cell cella = r.getCell(0);
		
		System.out.println(cella);
		
		fis.close();
	}

}
