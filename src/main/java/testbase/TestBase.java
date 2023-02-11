package testbase;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import driverfactory.DriverFactory;
import utils.PropConfig;

public class TestBase {
	static Logger log = Logger.getLogger(TestBase.class.getName());
	
	DriverFactory df;
	protected WebDriver driver;
	Properties prop;
	
//	public static Logger logger = Logger.getLogger(TestBase.class);
	
	@BeforeMethod
	public void beforeMethod()
	{
		log.info("Inside Before Method");
		
		PropConfig propConfig = new PropConfig();
		log.info("Properties initilised");
		try {
			prop = propConfig.init_prop("test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage().toString());
		}
		
		 df = new DriverFactory();
		 log.info("Driver initilized");
		 driver = df.initDriver(prop.getProperty("browser"));
		 driver.get(prop.getProperty("url"));
		 log.info("Url launched : " + prop.getProperty("url"));
		 
	}
	
	

	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}


}
