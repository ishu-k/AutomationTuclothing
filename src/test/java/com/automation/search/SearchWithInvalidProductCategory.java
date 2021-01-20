package com.automation.search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchWithInvalidProductCategory {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("consent_prompt_submit")).click();
		WebElement element= driver.findElement(By.id("search"));
		element.sendKeys("alltainability");
		element.sendKeys(Keys.ENTER);
	}

}
