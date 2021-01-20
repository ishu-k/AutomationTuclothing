package com.junit.practise.storelocator;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreLocatorOptionsClick {

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
	public void storelocator()
	{
		driver.findElement(By.linkText("Tu Store Locator")).click();
		driver.findElement(By.name("q")).sendKeys("MK11 3ER");
	    driver.findElement(By.cssSelector(".ln-c-form-option__label")).click();
	    driver.findElement(By.xpath("//label[contains(text(),'Click and Collect')]")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'Find stores')]")).click();
	    driver.findElement(By.xpath("//label[contains(text(),'Womens')]")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'Find stores')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Shenley Church End  (2.2 miles)')]")).click();
	}
	
	  @After 
	 public void tearDown() 
	 {
		 driver.close();
	 }
	 

}
