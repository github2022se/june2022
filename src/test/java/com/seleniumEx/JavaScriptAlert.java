package com.seleniumEx;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {
	private WebDriver driver;
	@Test
	public void testAlertPopUp() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("alertButton")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait= new WebDriverWait (driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();

		driver.findElement(By.id("confirmButton")).click();
		Alert alert3=driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert4=driver.switchTo().alert();
		alert4.sendKeys("QA Tester");
		alert4.accept();
		
}
}
