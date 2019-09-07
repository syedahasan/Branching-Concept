package com.bit.test;

import org.junit.Test;

import pages.ActiveWearPage;
import pages.CheckOutDetailPage;
import pages.CheckOutPage;
import pages.HomePage;
import pages.JuniorPage;
import pages.ProductDetailPage;
import pages.ShippingAdressDetailPage;

public class SmokeTest extends BaseTest {
	
	HomePage homePage;
	ActiveWearPage activeWearPage;
	JuniorPage juniorPage;
	ProductDetailPage productDetailPage;
	CheckOutPage checkOutPage;
	CheckOutDetailPage checkOutDetailPage;
	ShippingAdressDetailPage shippingDetailPage;
	
	
	@Test
	public void buyaProduct() {
		HomePage homepage=new HomePage(driver);
		homepage.hoverOverOnBackToSchool();
		activeWearPage= homepage.clickOnActiveWear();
		juniorPage= activeWearPage.clickOnJunior();
		productDetailPage = juniorPage.clickOnFirstproduct();
		productDetailPage.selectSize();
		productDetailPage.selectMediumSize();
		productDetailPage.clickOnAddToCart();
	    productDetailPage.clickOnCheckOut();
	    checkOutPage = productDetailPage.clickOnCheckOut();
		checkOutDetailPage = checkOutPage.clickCheckOutButton();
		shippingDetailPage = checkOutDetailPage.clickOnContinueAsGuest();
		shippingDetailPage.typeFirstName();
		shippingDetailPage.typeLastName();
		
		
	}
	

}
