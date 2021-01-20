package com.junit.practise;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class SpecialCharacterSearch {
   public static WebDriver driver;

	@Before
	public void setup()
	{
		System.out.println("method setup");
		
		  WebDriverManager.chromedriver().setup(); 
		  driver=new ChromeDriver();
		  driver.get("https://tuclothing.sainsburys.co.uk/");
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.findElement(By.id("consent_prompt_submit")).click();
		 	
	}
	
	@Test
	public void test() throws InterruptedException
	
	
	{
		System.out.println("method test");

		  driver.findElement(By.cssSelector("#search")).click(); WebElement
		  element=driver.findElement(By.cssSelector("#search"));
		 element.sendKeys(" @@@@"); element.sendKeys(Keys.ENTER); String
		  url=driver.getCurrentUrl(); System.out.println(url); String
		  actual=driver.getTitle(); System.out.println(actual); String
		 expected="Search results for: @@@@ | Tu clothing";
		  if(actual.equals(expected))
		  { System.out.println("test passed"); } else {
		 System.out.println("test failed"); }
	
	}
	@After
	public void tearDown()
	{
		System.out.println("method teardown");

		driver.close();
		
	}
}


