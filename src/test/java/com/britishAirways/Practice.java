package com.britishAirways;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.britishairways.com/travel/home/public/en_gb/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		  WebElement element=driver.findElement(By.cssSelector("#from"));
		  element.sendKeys("london"); element.sendKeys(Keys.ENTER); 
		  WebElement element1=driver.findElement(By.cssSelector("#to"));
		 element1.sendKeys("Delhi"); element1.sendKeys(Keys.ENTER);
		 
		driver.findElement(By.cssSelector(".outbound.date-selection")).click();
		driver.findElement(By.cssSelector("div[aria-label='15 January,2021']")).click();
		driver.findElement(By.cssSelector("#flight-inbound-date-selector")).click();
		/*
		 * List<WebElement>list=driver.findElements(By.xpath(
		 * "//tbody/tr[5]/td/div[1]/span")); int dateslist=list.size();
		 * System.out.println(dateslist); for(int i=0;i<dateslist;i++) { String
		 * returndate; 
		 * returndate=list.get(i).getText(); } System.out.println(returndate);
		 * if(returndate.equalsIgnoreCase("20")) { list.get(i).click(); break; }
		 * 
		 * }
		 */
		  try
		  { 
			  driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]")).click();
		  }
		  catch( org.openqa.selenium.StaleElementReferenceException e)
		  {
		  driver.findElement(By.xpath("//tbody/tr[5]/td[5]/div[1]")).click();
		  }
	
		 driver.findElement(By.cssSelector("#sb-Flight-pax-mix")).click();
		 /* driver.findElement(By.xpath(
		 * "//body/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/button[2]"
		 * )) .click()
		 */;
	    driver.findElements(By.cssSelector(".spinner-button-container>button:nth-child(2")).get(1).click();
	    int j = 0;
	     while(j<4)
	     {
	    	 driver.findElements(By.cssSelector(".spinner-button-container>button:nth-child(2")).get(2).click(); 
	    	 j++; 
	     }
	     driver.findElements(By.cssSelector(".spinner-button-container>button:nth-child(2")).get(3).click(); 
	     
		 driver.findElement(By.cssSelector("button[data-di-id='di-id-db7f86ab-cdb355b']")) .click();
         driver.findElement(By.cssSelector("#sb-flight-travel-class")).click();
         driver.findElement(By.xpath("//label[contains(text(),'Business')]")).click();
         driver.findElement(By.cssSelector("button[data-di-id=di-id-ae392d06-b7cc542f]")).click();
         driver.findElement(By.cssSelector(".primary.search-button")).click();
       }
    }
