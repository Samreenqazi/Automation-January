package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverfactory.DriverFactory;
import utils.PropConfig;

public class XYZ {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException
	{
		DriverFactory init = new DriverFactory();
		
//		File file = new File("C:\\Users\\prasa\\Class\\AutomationClassSept22\\flipkartautomation\\src\\main\\java\\test\\config.properties");
//		FileInputStream fis = new FileInputStream(file);
//		Properties prop = new Properties();
//		prop.load(fis);
		
		PropConfig propConfig = new PropConfig();
		Properties prop = propConfig.init_prop("uat");
		
		System.out.println(prop);
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		String browser = prop.get("browser").toString();
		String url = prop.get("url").toString();
		
		driver=	init.initDriver(browser);
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("_2doB4z")));
		driver.findElement(By.className("_2doB4z")).click();
		WebElement element =driver.findElement(By.name("q"));
		//driver.findElement(By.className("L0Z3Pu")).click();
		element.sendKeys("Iphone 12");
		element.submit();
	}

}
