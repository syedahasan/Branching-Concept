package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ShippingAdressDetailPage {

	WebDriver driver;
	
	 @FindBy (xpath = "//*[@id=\"shippingAddressForm\"]/div/div[1]/div[3]/div/div/div/div[1]/div[1]/input") WebElement firstName ;
	 @FindBy (xpath = "//*[@id=\"shippingAddressForm\"]/div/div[1]/div[3]/div/div/div/div[2]/div[1]/input") WebElement lastName;
//	 @FindBy (xpath = "") WebElement h;
//	 @FindBy (xpath = "") WebElement h;
//	 @FindBy (xpath = "") WebElement h;
	
	 public ShippingAdressDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void typeFirstName () {
	Helper.type(firstName, "Syeda");
		
	}
	public void typeLastName () {
	Helper.type(lastName, "Hasan");	
	}
	
}
