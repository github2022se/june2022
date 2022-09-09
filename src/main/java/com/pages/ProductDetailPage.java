package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.Assert;

public class ProductDetailPage {
WebDriver driver;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver=driver;

}
	@FindBy(css="h1[data-automation-id='product-title']")
	private WebElement productTitle;
	
	@FindBy(css="[id='GlobalOptions-AddToCart'] p[data-automation-id='addToCart'] ")
	private WebElement addtoCartButton;
	
	@FindBy(css="[data-automation-id='at-panel-checkout-button']")
	private WebElement checkoutbutton; 
	
	@FindBy(css="[data-automation-id='ocProductTitle']")
	private WebElement ocProductTitle;
	
	public void verifyProduct(String product) {
		String productText =productTitle.getText();
		Assert.assertEquals(productText,product);
	}
		public void clickOnAddToCart(){
			addtoCartButton.click();	
		}
		public void clickOnCheckOut(){
			checkoutbutton.click();
		
	}
		
		
}
