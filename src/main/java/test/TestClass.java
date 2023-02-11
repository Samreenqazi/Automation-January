package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Selenium\\usercredentials.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("credentials");
		
		int rownum = sheet.getLastRowNum();
		int colNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Rownum : " + rownum);
		System.out.println("colNum : " + colNum);
		
		Object[][] obj = new Object[rownum][colNum];
		
		for(int i=1; i<=rownum;i++)
		{
			
			for(int j=0; j<colNum; j++)
			{
				obj[i-1][j] = sheet.getRow(i).getCell(j);
				//System.out.println(sheet.getRow(i).getCell(j));
			}
		}
		
		
		for(int i=0; i<obj.length; i++)
		{
			for(int j=0 ; j<obj[0].length;j++)
			{
				System.out.println(obj[i][j]);
			}
		}
		
	}

}
