package com.junit.practise;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchWithInvalidProductCategory {

	WebDriver driver;
	@Before
		public void setUp()
		{
	   
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("consent_prompt_submit")).click();
		}
	
		@Test
		public void searchInvalid()
		{
			WebElement element= driver.findElement(By.id("search"));
			element.sendKeys("alltainability");
			element.sendKeys(Keys.ENTER);
			
		}
		
		@After 
		public void tearDown()
		{
			driver.close();
	}

}
