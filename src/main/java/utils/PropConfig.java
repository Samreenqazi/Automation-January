package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import net.bytebuddy.implementation.bytecode.Throw;

public class PropConfig {
	
	Properties prop;
	
	public Properties init_prop(String env) throws IOException
	{
		
		File file = null;
		if(env.equals("qa"))
		{
		 file = new File("C:\\Users\\prasa\\Class\\AutomationClassSept22\\flipkartautomation\\src\\main\\java\\config\\qa-config.properties");
		}
		else if(env.equals("uat"))
		{
			file = new File("C:\\Users\\qazis\\eclipse-workspace\\TditFrameWork\\src\\main\\java\\config\\uat-config.properties");
		}
		else if(env.equals("prod"))
		{
			file = new File("C:\\Users\\prasa\\Class\\AutomationClassSept22\\flipkartautomation\\src\\main\\java\\config\\prod-config.properties");
		}
		else
		{
			System.out.println("Enter Correct Env Name : [qa,uat,prod]");
			System.out.println("Terminating...");
			throw new FileNotFoundException("Please enter correct Environmemnt name...");
		}
		
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		return prop;
	}

}
