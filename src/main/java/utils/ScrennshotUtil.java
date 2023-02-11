package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScrennshotUtil {
	
	public static String filePath="C:\\Selenium\\";
	public static int i=1;
	
	public static void takeScreenshot(String fileName,WebDriver driver )
	{
		TakesScreenshot scr = (TakesScreenshot) driver;
		File file = scr.getScreenshotAs(OutputType.FILE);
		try {
			String path = filePath + fileName + i + ".png";
			FileUtils.copyFile(file, new File(path));
			i++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
