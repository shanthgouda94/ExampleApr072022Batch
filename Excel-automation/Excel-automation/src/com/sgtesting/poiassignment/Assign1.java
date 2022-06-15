package com.sgtesting.poiassignment;

	import java.io.FileOutputStream;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Assign1 {

		public static void main(String[] args) {
			writecontent();
		}
		private static void writecontent()
		{
			Workbook wb=null;
			Sheet sh=null;
			Row row=null;
			Cell cell=null;
			FileOutputStream fout=null;
			try 
			{
				wb= new XSSFWorkbook();
				sh=wb.createSheet("fruit");
				for(int i=0;i<20;i++)
				{
					row=sh.createRow(i);
					cell=row.createCell(0);
					cell.setCellValue("fruit"+i);	
			}
				fout=new FileOutputStream("E:\\EXCEL\\FRUIT.xlsx");
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
					sh=null;
					cell=null;
				}catch(Exception e)
				{
		      e.printStackTrace();
			}
		}
	}
	}
