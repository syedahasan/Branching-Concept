package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ActiveWearPage {
	
     WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Juniors']") WebElement juniorPath;
	
	
	
	public ActiveWearPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public JuniorPage clickOnJunior () {
	Helper.clickOnElement(juniorPath);	
	return new JuniorPage (driver);	
	}
	
}
