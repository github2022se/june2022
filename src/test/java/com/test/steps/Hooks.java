package com.test.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	 static WebDriver driver;
	@Before
	public void setup() {
		System.out.println("Before running scenario");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	}
	@BeforeStep
	public void beforesetup() {
		System.out.println("Before running each Steps");

}
	@AfterStep
	public void aftersetup() {
		System.out.println("After running each Steps");
	}
	   @After
		public void tearDown() {
			System.out.println("After running scenario");
			driver.close();
		}
}