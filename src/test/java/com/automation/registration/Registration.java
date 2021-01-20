package com.automation.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.xpath("//button[@data-testid='registerButton']")).click();
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		Select dropdown=new Select(driver.findElement(By.id("register_title")));
		dropdown.selectByIndex(1);
		driver.findElement(By.id("register_firstName")).sendKeys("Arjun");
		driver.findElement(By.name("lastName")).sendKeys("kasani");
		driver.findElement(By.name("pwd")).sendKeys("1233445");
		driver.findElement(By.id("register_checkPwd")).sendKeys("1233445");
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector(".ln-u-soft-bottom .ln-c-form-option--checkbox .ln-c-form-option__label")).click();
		driver.findElement(By.cssSelector("label[for='Terms & Conditions & Privacy Policy']")).click();
		
	}

}
