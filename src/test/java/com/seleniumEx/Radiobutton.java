package com.seleniumEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {
	private WebDriver driver;
	@Test
	public void testCheckbox() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/radio-button/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		
		boolean status =driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected();
		System.out.println(status);
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		//WebElement element=driver.findElement(By.xpath("//p[@class='mt-3']"));
		//status=driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected();
		//System.out.println(status);
		
		boolean status1 =driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected();
		System.out.println(status1);
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		
}
}
