package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class JuniorPage {

	 WebDriver driver;
		
		@FindBy (xpath = "//img[@src='//s7d4.scene7.com/is/image/JCPenney/DP0711201913012520M.tif?wid=350&hei=350&op_usm=.4,.8,0,0&resmode=sharp2']") WebElement juniorFirstProduct ;
		
		
		public JuniorPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public ProductDetailPage clickOnFirstproduct () {
		Helper.clickOnElement(juniorFirstProduct);
		return new ProductDetailPage (driver);
	}
	
	
}
