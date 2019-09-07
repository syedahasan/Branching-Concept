package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class CheckOutPage {

	WebDriver driver;
	
	 @FindBy (xpath = "//*[@id=\"checkoutButton\"]/span[2]") WebElement clickCheckOut;
	 //@FindBy(xpath = "//*[@id=\"atPanelContent\"]/div/section/section/section[1]/div[2]/div/button[2]") WebElement clickCheckOut;
	
	 public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public CheckOutDetailPage clickCheckOutButton () {
		Helper.clickOnElement(clickCheckOut);
		return new CheckOutDetailPage (driver);
	}
	
	
	
	
}
