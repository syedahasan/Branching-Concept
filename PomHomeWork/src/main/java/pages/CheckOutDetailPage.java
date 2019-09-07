package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class CheckOutDetailPage {

	WebDriver driver;
	
	 @FindBy (xpath = "//*[@id=\"content\"]/section/section/article/section/div/div[2]/div/div[2]/div[1]/button") WebElement continueAsGuest ;
	
	
	 public CheckOutDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public ShippingAdressDetailPage clickOnContinueAsGuest () {
	Helper.clickOnElement(continueAsGuest);	
	return new ShippingAdressDetailPage (driver);	
	}
	
	
}
