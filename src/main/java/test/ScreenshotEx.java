package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScrennshotUtil;

public class ScreenshotEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spglobalsolutions.in/tool2/login.php");
		ScrennshotUtil.takeScreenshot("screen", driver);
		driver.findElement(By.name("username")).sendKeys("sump1");
		ScrennshotUtil.takeScreenshot("screen", driver);
		driver.findElement(By.name("password")).sendKeys("techfin@12");
		ScrennshotUtil.takeScreenshot("screen", driver);
		driver.findElement(By.name("login")).click();
		
		ScrennshotUtil.takeScreenshot("screen", driver);

	}

}
