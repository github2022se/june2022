package com.seleniumEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment {
private WebDriver driver;
	
	@Test
	public void testFacebookSignIn() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.navigate().to("https://www.facebook.com/");// to method for navigating url or browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	WebElement element=driver.findElement(By.xpath("//h2"));
	String text=element.getText();
	System.out.println(text);
	Assert.assertEquals("Connect with friends and the world around you on Facebook.", text);
	
	String title= driver.getTitle();
	System.out.print(title);
	Assert.assertEquals("Facebook - log in or sign up", title);
	
	WebElement input=driver.findElement(By.id("email"));
	String att =input.getAttribute("aria-label");
	System.out.println(att);
	
	WebElement input1=driver.findElement(By.id("pass"));
	String att1 =input1.getAttribute("aria-label");
	System.out.println(att1);
	

	WebElement loginButton = driver.findElement(By.name("login"));
	String fontSizeValue = loginButton.getCssValue("font-size");
	System.out.println(fontSizeValue);
	
	driver.findElement(By.id("email")).sendKeys("@#@#@#@");
	
	//driver.findElement(By.xpath("//div[@class='_9ay7']/a}")).getText();
	//String text1=login.getText();
	//System.out.println(text);
	//Assert.assertEquals("The email or mobile number you entered isn’t connected to an account.", text);
	
	//WebElement element=driver.findElement(By.xpath("//h2"));
	//String text=element.getText();
	//System.out.println(text);
	//Assert.assertEquals("Connect with friends and the world around you on Facebook.", text);
	
}
}
