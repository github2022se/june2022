package com.seleniumEx;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JScroll {
	@Test
	public void Scrollpage() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String e="cierra@example.com";
		
				
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div/div[4]"));
       
		boolean status= false;
		for(WebElement element : elements) {
        	String email= element.getText();
    	System.out.println(email) ; 
    	if(email.trim().equals(e)) {
    		status= true;
    		break;
    	}
    	Assert.assertTrue(status);
        }

}
