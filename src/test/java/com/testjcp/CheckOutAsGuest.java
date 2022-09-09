package com.testjcp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.pages.SignInPage;
import com.utils.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CheckOutAsGuest extends BaseTest{ 
	String product="Cooks Stainless Steel 15-pc. Cookware Set";

	@Test
	public void checkoutAsGuest() {
		
		HomePage homePage= PageFactory.initElements(driver,HomePage.class);
		homePage.searchProduct(product);
		// any changes in we use page factory
		    //driver.findElement(By.id("searchInputId")).sendKeys(product);
	        //driver.findElement(By.xpath("//button[@data-automation-id='searchIconBlock']")).click();
	        
	        //String title =driver.findElement(By.cssSelector("h1[data-automation-id='product-title']")).getText();
	        //Assert.assertEquals(title, product);
	        
	        
	        ProductDetailPage productDetailPage=PageFactory.initElements(driver, ProductDetailPage.class);
	        productDetailPage.verifyProduct(product);
	        
	        productDetailPage.clickOnAddToCart();
	        productDetailPage.clickOnCheckOut();
	        
	        //driver.findElement(By.cssSelector("[id='GlobalOptions-AddToCart']  p[data-automation-id='addToCart'] ")).click();
	        
	       // driver.findElement(By.cssSelector("[data-automation-id='at-panel-checkout-button']")).click();
	        
	       // String cartTitle =driver.findElement(By.cssSelector("[data-automation-id='ocProductTitle']")).getText();
	        //Assert.assertEquals(cartTitle, product);
	        CartPage cartPage= PageFactory.initElements(driver, CartPage.class);
	        cartPage.verifyProduct(product);
	        cartPage.clickOnCheckOutButton();
	        
	        //driver.findElement(By.cssSelector("[data-automation-id='test-automation-btn-checkout']")).click();
	        
	        SignInPage signInPage=PageFactory.initElements(driver, SignInPage.class);
	        signInPage.signIn("userName", "password");
	        
	        //driver.findElement(By.cssSelector("#email")).sendKeys("User@gmail.com");
	  		//driver.findElement(By.cssSelector("#cartSignInPassword")).sendKeys("Pass2022");
	        //driver.findElement(By.cssSelector("[data-automation-id=\"at-sign-in-button\"]")).click();
	}
		
	
}
// Page Object Model framework: Create seperate pages file
// reduces the times of entering"Input"
