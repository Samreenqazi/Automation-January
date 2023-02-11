package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driverfactory.DriverFactory;
import pages.HomePage;
import testbase.TestBase;
import utils.Constants;

public class TestHomePage extends TestBase{
	

	@Test
	public void testSearch()
	{
		HomePage hp = new HomePage(driver);
		hp.enterSearchText("Iphone 12");
		hp.selectSearchCategory("Electronics");
		hp.clickSearchButton();
		
	}
	
	@Test
	public void verifyTitle()
	{
		HomePage hp = new HomePage(driver);
		String actual = hp.getTitle();
		Assert.assertEquals(actual, Constants.HOME_PAGE_TITLE);
		
	}
	
	
	

}
