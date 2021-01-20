package com.johnlewis;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SignIn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.johnlewis.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".c-button--primary-3tLoH")).click();
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.cssSelector("a[href^='/men/c50000300']")).click();
		  Actions action=new Actions(driver); WebElement
		  element=driver.findElement(By.linkText("Men"));
		  action.moveToElement(element).perform();
		 
		driver.findElement(By.cssSelector(".navigation-items--cc199>li:nth-child(6)")).click();
		//driver.findElement(By.cssSelector("area-categories-nav__list .area-categories-nav-item")).click();
		driver.findElement(By.linkText("50% off Loungewear")).click();
		//driver.findElement(By.cssSelector("div[dataset='product-title']")).click();
		/*
		 * driver.findElements (By.
		 * cssSelector("image_imageLink__1tBDW product-card_c-product-card__image__3CdTi product__image"
		 * )) .get(2).click();
		 */
		driver.findElement(By.xpath("//h2[contains(text(),'John Lewis & Partners Cashmere Half Zip Jumper')]")).click();
		//driver.findElement(By.cssSelector("h2:contains('John Lewis & Partners Cashmere Half Zip Jumper')")).click();
		driver.findElement(By.cssSelector(".close--2r7jh")).click();
		driver.findElement(By.cssSelector("#add-to-basket-button")).click();
		driver.findElement(By.cssSelector(".c-button--secondary--2aq5s")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("123cdas");
		driver.findElement(By.cssSelector("#loginForm")).click();
		String actual=driver.findElement(By.cssSelector(".sessioncamlogerror")).getText();
		System.out.println(actual);
		String expected="Sorry, this account doesn’t seem to have a password";
		/*
		 * if(actual.equalsIgnoreCase(expected)) { System.out.println("test passed"); }
		 * else { System.out.println("test failed"); }
		 */
		Assert.assertEquals(expected, actual);

	}

}
