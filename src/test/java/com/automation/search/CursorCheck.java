package com.automation.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CursorCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(3000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		WebElement element= driver.findElement(By.id("search"));
		element.click();
		driver.findElement(By.cssSelector(".ln-u-text-align-right")).click();
	}

}
