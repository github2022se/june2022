package com.seleniumEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionExample {
	private WebDriver driver;
	@Test
	public void testbuttonbox() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions action=new Actions (driver);
		WebElement button1=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(button1).build().perform();
		
		String message1=driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(message1, "You have done a double click");

		
		WebElement button2=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(button2).build().perform();
		
		String message2=driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals(message2, "You have done a right click");
		
		WebElement button3=driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(button3).build().perform();
		String message3=driver.findElement(By.id("dynamicClickMessage")).getText();
		Assert.assertEquals(message3, "You have done a dynamic click");
}
	
	@Test
	public void testDragDrop() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		WebElement dropMessage=driver.findElement(By.xpath("//div[@id='droppable']/p"));
		String msg=dropMessage.getText();
		Assert.assertEquals(msg,"Dropped!");
		
}
	@Test
	public void testDragDropByObject() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/dragabble/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement source= driver.findElement(By.id("dragBox"));
		
		Actions action= new Actions(driver);
		action.dragAndDropBy(source, 100, 200).perform();
		
}
	@Test
	public void testMouseMove() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mainMenu= driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(mainMenu).pause(Duration.ofSeconds(2))
		              .moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")))
		              .click(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).build().perform();
	    
}
}
