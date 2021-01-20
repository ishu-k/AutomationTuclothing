package com.automation.basket;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingMutipleProdcuts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.id("search"));
		element.sendKeys("shoes");
		element.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//p[contains(text(),'Sole Comfort Brown Blucher Shoes')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'11')]")).click();
		WebElement element3=driver.findElement(By.cssSelector("#productVariantQty"));
		Select dropdown=new Select(element3);
		dropdown.selectByIndex(2);
		driver.findElement(By.cssSelector("#AddToCart")).click();
		 driver.findElement(By.cssSelector("#basket-title")).click();
		 WebElement element1= driver.findElement(By.id("search"));
			element1.sendKeys("Grey Marl Crew Neck Sweatshirt");
			element1.sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//p[contains(text(),'Maternity Grey Marl Sweatshirt')]")).click();
		 driver.findElement(By.cssSelector(".ln-u-text-align-center>div:nth-child(4)")).click();
		 //driver.findElement(By.xpath("//div[contains(text(),'10')]")).click();
		 Select dropdown2=new Select(driver.findElement(By.id("productVariantQty")));
		 dropdown2.selectByIndex(3);
		 driver.findElement(By.cssSelector("#AddToCart")).click();
		 //driver.findElement(By.linkText("Checkout")).click();
		 driver.findElement(By.xpath("//div[@id='cart_button']//self::a")).click();
		 		
	}

}
