package com.automation.storelocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreLocatorOptionsClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.findElement(By.linkText("Tu Store Locator")).click();
		driver.findElement(By.name("q")).sendKeys("MK11 3ER");
	    driver.findElement(By.className("ln-c-form-option__label")).click();
	    driver.findElement(By.xpath("//label[contains(text(),'Click and Collect')]")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'Find stores')]")).click();
	    driver.findElement(By.xpath("//label[contains(text(),'Womens')]")).click();
	    //driver.findElement(By.xpath("//button[contains(text(),'Find stores')]")).click();
	    
	}

}
