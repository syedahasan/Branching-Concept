package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ProductDetailPage {

	 WebDriver driver;
		
	 @FindBy (xpath = "//*[@id=\"content\"]/main/article/section/section[3]/div[2]/section[2]/section/div[1]/div[2]/div[2]/div[1]/select") WebElement selectSizePath;
     @FindBy (xpath = "//*[@id=\"content\"]/main/article/section/section[3]/div[2]/section[2]/section/div[1]/div[2]/div[2]/div[1]/select/option[4]") WebElement selectSizeMediumPath;
	 @FindBy (xpath = "//*[@id=\"GlobalOptions-AddToCart\"]/button/div/p[2]") WebElement clickAddToCart;
	 @FindBy (xpath = "//*[@id=\"atPanelContent\"]/div/section/section/section[1]/div[2]/div/button[2]") WebElement clickCheckOutPath;	
	 public ProductDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public void selectSize () {
	//Helper.selectElement(selectSizePath, "medium");
	Helper.clickOnElement(selectSizePath);
	
	}
	
	public void selectMediumSize () {
    Helper.clickOnElement(selectSizeMediumPath);
	}
	
	public void clickOnAddToCart () {
	Helper.clickOnElement(clickAddToCart);	
	
			
	}
	public CheckOutPage clickOnCheckOut () {
	Helper.clickOnElement(clickCheckOutPath);	
	return new CheckOutPage(driver);	
	}
	
	
}
