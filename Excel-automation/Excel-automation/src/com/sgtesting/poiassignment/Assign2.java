package com.sgtesting.poiassignment;

import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign2{

	public static void main(String[] args) {
		writecontent();
	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("flowers");

			row=sh.createRow(0);
			for(int i=0;i<20;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("flowers"+i);
			}
			fout=new FileOutputStream("E:\\EXCEL\\FLOWERS.xlsx");
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
				row=null;
				cell=null;
				sh=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}

