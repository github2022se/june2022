package com.seleniumEx;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsBrowser {
	

	private WebDriver driver;
	@Test
	public void testWindowsEx() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("tabButton")).click();
		String parent=driver.getWindowHandle();
		Set<String> windows =driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
		}
		driver.quit();
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		//driver.close();
		
		 driver.switchTo().window(parent);
		 
		 driver.findElement(By.id("windowButton")).click();
		 Set<String> windows1 =driver.getWindowHandles();
			for(String window:windows1) {
				driver.switchTo().window(window);
			}
			driver.close();
			 driver.switchTo().window(parent);
		     driver.findElement(By.id("messageWindowButton")).click();
			
} 
}
