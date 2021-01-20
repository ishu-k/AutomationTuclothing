package com.automation.search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchWithNoData {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.findElement(By.id("consent_prompt_submit")).click();
		WebElement element= driver.findElement(By.id("search"));
		element.sendKeys("     ");
		element.sendKeys(Keys.ENTER);
		
	}

}
