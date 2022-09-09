package com.seleniumEx;

import java.time.Duration;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotOfPage {
	
	@Test
	public void testSelenium()throws IOException{ 
		
	
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver= new ChromeDriver();
	     driver.navigate().to("https://demoqa.com/webtables");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     TakesScreenshot ts=(TakesScreenshot)driver;
	     File file=ts.getScreenshotAs(OutputType.FILE);
	     File file1=new File("image1.png");
	     FileUtils.copyFile(file, file1);
	     
	     File file2=driver.findElement(By.id("downloadButton")).getScreenshotAs(OutputType.FILE);
	     File file3=new File("downloadButton.png");
	     FileUtils.copyFile(file2, file3);

}
