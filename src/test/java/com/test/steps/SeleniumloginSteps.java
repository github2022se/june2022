package com.test.steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumloginSteps {
	
	
	@Given("I navigated url on browser")
	public void i_navigated_url_on_browser() {
		Hooks.driver.navigate().to("https://www.facebook.com/");
		
	}
	@When("I enter user name into user input field")
	public void i_enter_user_name_into_user_input_field() {
		Hooks.driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
	}

	@When("I enter password in password field")
	public void i_enter_password_in_password_field() {
		Hooks.driver.findElement(By.id("pass")).sendKeys("123456");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		Hooks.driver.findElement(By.name("login")).click(); 
	}

	@Then("I verify user login successfully")
	public void i_verify_user_login_successfully() {
	   
	}

	@Then("I verified user not login successfully")
	public void i_verified_user_not_login_successfully() {
	   
	}

}
