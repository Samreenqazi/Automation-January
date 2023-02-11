package pages;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.ElementUtils;

public class HomePage {
	
	//Page Elements
	By searchBox = By.id("twotabsearchtextbox");
	By searchButton = By.id("nav-search-submit-button");
	By searchCategoryDropdown = By.id("searchDropdownBox");
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public static Logger logger = Logger.getLogger(HomePage.class);
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		elementUtils = new ElementUtils(driver);
	}
	
	//Page Actions
	public void enterSearchText(String text)
	{
		logger.info("Inside enterSearchText");
		
		elementUtils.enterText(searchBox, text);
	}
	
	public void selectSearchCategory(String category)
	{
		WebElement dropdown = elementUtils.getElement(searchCategoryDropdown);
		elementUtils.selectDropdownByVisibleText(dropdown, category);
		
	}
	
	public void clickSearchButton()
	{
		elementUtils.clickElement(searchButton);
	}
	
	public String getTitle()
	{
		return elementUtils.getTitle();
	}

}
