package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	File file;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public static String filePath = "\\src\\test\\resources\\usercredentials.xlsx";
	
	public ExcelReader(String sheetName)
	{
		String userdir = System.getProperty("user.dir");
		//System.out.println(userdir);
		String fullPath = userdir+filePath;
		//System.out.println(fullPath);
		file = new File(fullPath);
		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int getRowNum()
	{
		return sheet.getLastRowNum();
	}
	
	public int getColNum()
	{
		return sheet.getRow(0).getLastCellNum();
	}
	
	public Object[][] getAllData()
	{
		int rownum = getRowNum();
		int colNum= getColNum();
		Object[][] obj = new Object[rownum][colNum];
		
		for(int i=1; i<=rownum;i++)
		{
			
			for(int j=0; j<colNum; j++)
			{
				obj[i-1][j] = sheet.getRow(i).getCell(j).toString();
				//System.out.println(sheet.getRow(i).getCell(j));
			}
		}
		
		return obj;
		
	}
	


}
