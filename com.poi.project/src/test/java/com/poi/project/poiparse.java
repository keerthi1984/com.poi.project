package com.poi.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiparse {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb1 = new XSSFWorkbook();
		
		XSSFSheet st1 = wb1.createSheet("first Sheet");
		
		for (int i=0; i<10; i++)
		{
			Row row = st1.createRow(i);
			for(int j=0; j<5;j++)
			{
				if(i==0)
				{
				Cell cella = row.createCell(j);
				cella.setCellValue("Lakshmi");
				}else
				{
					Cell cella = row.createCell(j);
					cella.setCellValue("Keerthi");
				}
			}
			
		}
		
		/*
		 * Row row1 = st1.createRow(0);
		 * 
		 * 
		 * Cell cellA = row1.createCell(0); Cell cellB = row1.createCell(1);
		 * cellA.setCellValue("Keerthi"); cellB.setCellValue("Lakshmi");
		 */
		
		File f = new File("C:\\Users\\k.lakshmi.sheela\\Desktop\\POI.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		wb1.write(fos);
		fos.close();
		
	

	}

}
