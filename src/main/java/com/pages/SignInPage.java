package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
WebDriver driver;
	
	public  SignInPage (WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(css="#email")
	private WebElement elementUser;
	
	@FindBy(css="#cartSignInPassword")
	private WebElement passwordInput;
	
	@FindBy(css="[data-automation-id=\"at-sign-in-button\"]")
	private WebElement loginButton;
	
	@FindBy(css="[data-automation-id='at-create-account-button']")
	private WebElement accountButton;
	
	
	public void signIn(String userName,String password) {
		elementUser.sendKeys("User@gmail.com");
		passwordInput.sendKeys("Pass2022");
		loginButton.click();
}
	public void clickAccountButton() {
		accountButton.click();
		
	}
}
