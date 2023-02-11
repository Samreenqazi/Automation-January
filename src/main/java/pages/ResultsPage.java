package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElementUtils;

public class ResultsPage {
	
	WebDriver driver;
	
	By allResultsText = By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']");
	
	ElementUtils elementUtils;
	public ResultsPage(WebDriver driver)
	{
		this.driver=driver;
		elementUtils = new ElementUtils(driver);
	}
	
	
	public int getNumberOfResultsOnThePage()
	{
		List<WebElement> list =elementUtils.getElements(allResultsText);
		return list.size();
	}

}
