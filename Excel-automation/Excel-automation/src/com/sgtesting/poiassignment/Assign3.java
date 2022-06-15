package com.sgtesting.poiassignment;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign3 {

	public static void main(String[] args) {

		writecantent();
	}
	private static void writecantent()
	{
		FileOutputStream fout=null;
		Sheet sh=null;
		Workbook wb=null;
		Cell cell=null;
		Row  row=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("colours");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				for(int k=0;k<20;k++)
				{
					cell=row.createCell(i);
					cell.setCellValue("colour"+i);
				}
			}
			fout=new FileOutputStream("E:\\EXCEL\\colours.xlsx");
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
				sh=null;
				cell=null;
				row=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}

