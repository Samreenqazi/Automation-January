package tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driverfactory.DriverFactory;
import pages.HomePage;
import pages.ResultsPage;
import testbase.TestBase;
import utils.Constants;

public class ResultsPageTest extends TestBase {
	static Logger log = Logger.getLogger(ResultsPageTest.class.getName());
	
	@Test
	public void verifyNumberOfResults() throws InterruptedException
	{
		log.info("Inside verifyNumberOfResults" );
		 HomePage hp = new HomePage(driver);
		 hp.enterSearchText("Iphone 12");
		 log.info("Entered text in search box" );
			hp.selectSearchCategory("Electronics");
			hp.clickSearchButton();
			Thread.sleep(2000);
		 ResultsPage rp = new ResultsPage(driver);
		 log.info("Expected Result: " +  Constants.NUMBER_OF_RESULTS_PER_PAGE);
		
		 int actual = rp.getNumberOfResultsOnThePage();
		 log.info("Actual Result: " + actual);
		 Assert.assertEquals(actual, Constants.NUMBER_OF_RESULTS_PER_PAGE);
	}
	
}
