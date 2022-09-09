package com.test.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Steps1 {
	
	int a;
	int b;
	int result;
	
	@Given("I have two integer values {int} and {int}")
	public void i_have_two_integer_values_and(Integer int1, Integer int2) {
	 a=int1;
	 b=int2;
	 
	}

	@When("I add both values")
	public void i_add_both_values() {
		result=a+b;
		
	}

	@Then("I verify result is {int}")
	public void i_verify_result_is(Integer int1) {
		Assert.assertEquals(result,int1);
	
	}
	@Given("I am background")
	public void i_am_background() {
	  System.out.println("Iam printing");

}
}
