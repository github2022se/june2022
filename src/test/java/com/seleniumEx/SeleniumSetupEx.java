package com.seleniumEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetupEx {
	private WebDriver driver;
         
	@Test
	public void testSelenium() {
	
		// this both not working for me
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\celan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver(); // as we add Webdriver on Top, we dont need to chromedriver
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\celan\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver=new FirefoxDriver();
		
		
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver= new EdgeDriver();
		 
	
		driver.navigate().to("https://www.facebook.com/");
		
		
	}
	
	
}
