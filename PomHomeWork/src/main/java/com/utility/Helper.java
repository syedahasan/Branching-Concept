package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Helper {

	public static void mouseOver (WebDriver driver, WebElement element) {
	Actions a = new Actions(driver)	;
	a.moveToElement(element).perform();	
	}

	public static void clickOnElement (WebElement element) {
	element.click();
	}
	
	public static WebElement waitForElement (WebElement element) {
	ExpectedConditions.invisibilityOf(element);
	return element;	
		
	}
	
	public static void selectElement (WebElement element, String value) {
	//new Select(element).selectByVisibleText(text);
	new Select(element).selectByValue(value);	
		
	}
	
	public static void type(WebElement ele, String value) {
		ele.sendKeys(value);
	
    }
	
	
	
	
}


