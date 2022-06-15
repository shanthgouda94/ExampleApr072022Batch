package com.sgtesting.poiassignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign4{

	public static void main(String[] args) {

		writecantent();
	}
	private static void writecantent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("country&captial");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue("country"+i);
				cell=row.createCell(1);
				cell.setCellValue("captial"+i);
			}
			fout=new FileOutputStream("E:\\EXCEL\\country&captial.xlsx");
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

