package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelReader;

public class TestExcelReader {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		ExcelReader excel = new ExcelReader("credentials");
//		System.out.println(excel.getRowNum());
//		System.out.println(excel.getColNum());
//		ExcelReader excel1 = new ExcelReader("data");
//		System.out.println(excel1.getRowNum());
//		System.out.println(excel1.getColNum());
//		
//		Object[][] obj = excel1.getAllData();
//		
//		for(int i=0; i<obj.length; i++)
//		{
//			for(int j=0 ; j<obj[0].length;j++)
//			{
//				System.out.println(obj[i][j]);
//			}
//		}
//		
//	}
	
	
	@Test(dataProvider = "dataForLoginTest")
	public void loginTest(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] dataForLoginTest()
	{
		ExcelReader excel = new ExcelReader("credentials");
		return excel.getAllData();
	}

}
