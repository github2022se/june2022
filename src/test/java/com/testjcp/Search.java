package com.testjcp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.utils.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Search extends BaseTest{
	//as we extend from BaseTest we don't need this below ststement
	//private WebDriver driver;
	
	String product="Cooks Stainless Steel 15-pc. Cookware Set";
	
	//@BeforeClass
	//public void setUp() {
		//WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();
		
	//}
	
	@Test
	public void testClick() {
		
		//WebDriverManager.chromedriver().setup();
		//driver= new ChromeDriver();
		//driver.navigate().to("https://www.jcpenney.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().window().maximize();
		
		
		// using HomePage the following is not needed
        //driver.findElement(By.id("searchInputId")).sendKeys(product);
        //driver.findElement(By.xpath("//button[@data-automation-id='searchIconBlock']")).click();
       
		HomePage homePage= PageFactory.initElements(driver,HomePage.class);
		homePage.searchProduct(product);
		
        String title =driver.findElement(By.cssSelector("h1[data-automation-id='product-title']")).getText();
        Assert.assertEquals(title, product);
        
        ProductDetailPage productDetailPage=PageFactory.initElements(driver, ProductDetailPage.class);
        productDetailPage.verifyProduct(product);
        
        
	}
	//@AfterClass
	//public void tearDown() {
       // driver.quit();
}
//}
////*[@id="productTitle-false"] xpath----relative xpath
///html/body/div[1]/main/article/section/section[3]/div[2]/span[3]/div/h1---- full x path(absolute x path)
//h1[@data-automation-id="product-title"]--- for x path
//h1[data-automation-id="product-title"]--- for css selector
//----#productTitle-false --css selector
//.product-title--add . for class
