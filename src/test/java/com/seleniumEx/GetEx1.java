package com.seleniumEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetEx1 {
	private WebDriver driver;
	
	@Test
	public void testFacebookSignIn() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.navigate().to("https://www.facebook.com/");// to method for navigating url or browser
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	String title= driver.getTitle();
	System.out.print(title);
	Assert.assertEquals("Facebook - log in or sign up", title);
	
	/*String source=driver.getPageSource();
	System.out.print(source);
	
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	String url= driver.getCurrentUrl();
	System.out.print(url);
	Assert.assertTrue(url.contains("login/identify"));
	
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();*/
	
	//driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("QAGuru");
	//driver.findElement(By.xpath("//input[@aria-label='Password')]"));
	WebElement element=driver.findElement(By.xpath("//h2"));
	String text=element.getText();
	System.out.println(text);
	Assert.assertEquals("Connect with friends and the world around you on Facebook.", text);
	
	WebElement input=driver.findElement(By.id("email"));
	String att =input.getAttribute("aria-label");
	System.out.println(att);
	
	WebElement input1=driver.findElement(By.id("pass"));
	String att1 =input1.getAttribute("aria-label");
	System.out.println(att1);
	
	WebElement loginButton = driver.findElement(By.name("login"));
	String fontSizeValue = loginButton.getCssValue("font-size");
	System.out.println(fontSizeValue);
	
	Point point=loginButton.getLocation();
	System.out.println(point.getX() + " " + point.getY());
	
	Dimension dim=loginButton.getSize();
	System.out.println(dim.getHeight() + " " +dim.getWidth());
	
	String name=loginButton.getTagName();
	System.out.println(name);
	
	 
	
	
	
	

	
	
	
	
			

}

	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}
}
