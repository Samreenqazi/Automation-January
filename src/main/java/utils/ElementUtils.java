package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	
	WebDriver driver;
	
	public ElementUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterText(By locator, String text)
	{
		System.out.println("Inside EnterSearchText : ");
		System.out.println("Locator : " + locator);
		System.out.println("Text : " + text );
		driver.findElement(locator).sendKeys(text);
	}
	
	public void enterText(String xpath, String text)
	{
		System.out.println("Inside enterText : ");
		System.out.println("Locator : " + xpath);
		System.out.println("Text : " + text );
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	public void clickElement(By locator)
	{
		System.out.println("Inside clickElement : ");
		System.out.println("Locator : " + locator);
		driver.findElement(locator).click();
	}
	
	public String getTitle()
	{
		System.out.println("Getting Title : " + driver.getTitle());
		return driver.getTitle();
	}
	
	
	public WebElement getElement(By Locator)
	{
		System.out.println("Inside getElement : ");
		System.out.println("Locator : " + Locator);
		return driver.findElement(Locator);
	}
	
	public List<WebElement> getElements(By Locator)
	{
		System.out.println("Inside getElements : ");
		System.out.println("Locator : " + Locator);
		return driver.findElements(Locator);
	}
	
	public void selectDropdownByVisibleText(WebElement element, String text)
	{
		System.out.println("Inside selectDropdownByVisibleText : ");
		System.out.println("Text : " + text);
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectDropdownByIndex(WebElement element, int index)
	{
		System.out.println("Inside selectDropdownByVisibleText : ");
		System.out.println("Index : " + index);
		Select select = new Select(element);
		select.selectByIndex(index);
	}



}
