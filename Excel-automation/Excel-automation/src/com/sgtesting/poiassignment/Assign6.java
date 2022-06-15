package com.sgtesting.poiassignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign6 {

	public static void main(String[] args) {
		
		ReadWritecontent();
	}
	private static void ReadWritecontent()
	{
		FileOutputStream fout=null;
		FileInputStream fin=null;
		Workbook  wb=null;
		Sheet sh1=null;
        Sheet sh2=null;
        Row  sh1row=null;
        Row sh2row=null;
        Cell sh1cell=null;
        Cell sh2cell=null;
        try
        {
        	fin=new FileInputStream("E:\\EXCEL\\test.xlsx");
        	wb=new XSSFWorkbook(fin);
        	sh1=wb.getSheet("sheet1");
        	sh2=wb.getSheet("sheet2");
        	if(sh2==null)
        	{
        		sh2=wb.createSheet("sheet2");
        	}
        	int rc=sh1.getPhysicalNumberOfRows();
        	for(int r=0;r<rc;r++)
        	{
        		sh1row=sh1.getRow(r);
        		sh2row=sh2.getRow(0);
        		if(sh2row==null)
        		{
        			sh2row=sh2.createRow(r);
        		}
        		int cc=sh1row.getPhysicalNumberOfCells();
        				for(int j=0;j<cc;j++)
        				{
        					sh1cell=sh1row.getCell(j);
        					sh2cell=sh2row.getCell(r);
        					if(sh2cell==null)
        					{
        						sh2cell=sh2row.createCell(r);
        					}
        					String data=sh1cell.getStringCellValue();
        					sh2cell.setCellValue(data);
        				}
        	}
        	fout=new FileOutputStream("E:\\EXCEL\\test.xlsx");
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
        		fin.close();
        		wb.close();
        		sh1=null;
        		sh2=null;
        		sh1cell=null;
        		sh2cell=null;
        		sh1row=null;
        		sh2row=null;
        		
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        }
	}

}

