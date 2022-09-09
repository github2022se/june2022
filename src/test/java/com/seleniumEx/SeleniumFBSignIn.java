package com.seleniumEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFBSignIn {
	private WebDriver driver;
	@Test
	public void testFacebookSignIn() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement element = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		element.click();
		 
		WebElement firstElement = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstElement.sendKeys("QATester");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@aria-label ='Mobile number or email']")).sendKeys("test1234@gmail.com");
		//driver.quit();
		
		WebElement day  = driver.findElement(By.xpath("//select[@id='day']"));
		Select select=new Select(day);
		//select.selectByIndex(10);
		select.selectByValue("10");
		
		Select selectMonth= new Select(driver.findElement(By.xpath("//select[@id='month']")));
		//select.selectByValue("3");
		select.selectByVisibleText("Mar");
		
		
				
		
	}

}
//implicit wait, explicit wait