package com.automation.basket;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToBasket {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.id("search"));
		element.sendKeys("shoes");
		element.sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("p:contains('Sole Comfort Khaki Hiker Shoes')")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Sole Comfort Brown Blucher Shoes')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'11')]")).click();
		WebElement element3=driver.findElement(By.cssSelector("#productVariantQty"));
		Select dropdown=new Select(element3);
		dropdown.selectByIndex(2);
		driver.findElement(By.cssSelector("#AddToCart")).click();
		 //driver.findElement(By.cssSelector("#basket-title")).click();
		 /*
		 * driver.findElement(By.xpath("//a[contains(text(),'View Basket & checkout')]")
		 * ).click();
		 */
		 //.active .ln-c-button--primary
		  Thread.sleep(5000);
		 //driver.findElement(By.cssSelector(".active .ln-c-button--primary")).click();
		 //driver.findElement(By.cssSelector("#cart_button .ln-c-button--primary")).click();
		  driver.findElement(By.xpath("//div[@id='cart_button']//self::a")).click();
		  driver.findElement(By.cssSelector(".basketTopRightHeader .tuButton")).click();
		  driver.findElement(By.cssSelector("#guest_email")).sendKeys("ishukasani@gmail.com");
		  driver.findElement(By.cssSelector("div[class=submit-container]>button")).click();
		  driver.findElements(By.cssSelector(".ln-c-form-option__label .customer-options--title"))
		  .get(0).click();
		  driver.findElement(By.cssSelector(".ln-u-text-align-center .ln-c-button--primary")).click();
		  WebElement element4=driver.findElement(By.cssSelector(".LocationLookup-module__label--_u-IJ .null"));
				element4.sendKeys("MKK11 3ER");
				element4.sendKeys(Keys.ENTER);
		 //driver.findElements(By.cssSelector(".StoreCard-module__storeCardActionsContainer--3he65")).get(0).click();
		  driver.findElements(By.cssSelector
		  (".StoreCard-module__storeCardActionsContainer--3he65>button:nth-child(2)")).get(0).click();
		 
	}

}
