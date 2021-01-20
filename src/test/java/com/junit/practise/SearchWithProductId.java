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

public class SearchWithProductId {

	WebDriver driver;
	@Before 
	public void setUp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		Thread.sleep(3000);
	}
	@Test
	public void search()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element= driver.findElement(By.id("search"));
		element.sendKeys("christmas");
		element.sendKeys(Keys.ENTER);
	}
	@After
	public void tearDown()
	{
		driver.close();
	}

}
