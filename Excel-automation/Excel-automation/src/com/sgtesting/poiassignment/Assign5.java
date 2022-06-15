package com.sgtesting.poiassignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign5 {

	public static void main(String[] args) {

		writecontent();
	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Cell cell=null;
		Row row=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("flower&colours");

			row=sh.createRow(8);
			for(int i=0;i<20;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("flower"+i);
			}
			row=sh.createRow(9);
			for(int k=0;k<20;k++)
			{
				cell=row.createCell(k);
				cell.setCellValue("colours"+k);
			}
			fout=new FileOutputStream("E:\\EXCEL\\flower&colours.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
				cell=null;
				row=null;
				sh=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
}