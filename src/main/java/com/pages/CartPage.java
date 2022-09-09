package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class CartPage {
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(css="[data-automation-id='ocProductTitle']")
	private WebElement productTitle;
	
	@FindBy(css="[data-automation-id='test-automation-btn-checkout']")
	private WebElement checkOutButton;
	
	public void verifyProduct(String product) {
		String cartTitle=productTitle.getText();
				Assert.assertEquals(cartTitle, product);
				
	}
	public void clickOnCheckOutButton(){
		checkOutButton.click();
	}	
	
}
