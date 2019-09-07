package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath = "//div[text()='Back To School']") WebElement backToSchool;
	@FindBy (xpath = "//a[text()='Activewear']") WebElement activeWearSubMenu;
	
	
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void hoverOverOnBackToSchool() {
		Helper.mouseOver(driver, backToSchool);
		
	}
	public ActiveWearPage clickOnActiveWear () {
	Helper.clickOnElement(activeWearSubMenu);	
	return new ActiveWearPage(driver);	
	}
	
	
	
}
 