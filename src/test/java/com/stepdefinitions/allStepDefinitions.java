package com.stepdefinitions;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.junit.Assert;
//import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.hamcrest.CoreMatchers.containsString;
//import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

public class allStepDefinitions {
	public static WebDriver driver=null;

		
	@Given("^Im on home page$")
	public void im_on_home_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("consent_prompt_submit")).click();
	}

	@When("^I search for a prodcut$")
	public void i_search_for_a_prodcut() throws Throwable {
		WebElement element= driver.findElement(By.id("search"));
	    element.sendKeys("jumper");
	    element.sendKeys(Keys.ENTER);
	    
	}

	@Then("^I should see the desired product$")
	public void i_should_see_the_desired_product() throws Throwable {
		String actual= driver.getTitle();
        System.out.println(actual);
       String expected ="jumper";
       Assert.assertThat(actual,containsString(expected));
       driver.close();
	    
	}

@When("^I search with invalid productcategory$")
public void i_search_with_invalid_productcategory() throws Throwable {
	WebElement element= driver.findElement(By.id("search"));
    element.sendKeys("alltainability");
    element.sendKeys(Keys.ENTER);
    
}

@Then("^I should see the invalid product error$")
public void i_should_see_the_invalid_product_error() throws Throwable {
	String expected ="Sorry, no results for 'alltainability'" ;
    String actual=
            driver.findElement(By.xpath("//h1[contains(text(),\"Sorry, no results for 'alltainability'\")]")).getText();
    Thread.sleep(3000);
    System.out.println(expected);
    Assert.assertThat(actual,containsString(expected)); 
    driver.close();
    //asserThat(actual,is(equalsIgnoranceCase(expected)));
}
@When("^I search for cursor check$")
public void iSearchForCursorCheck() {
    WebElement element= driver.findElement(By.id("search"));
    element.click();
    driver.findElement(By.cssSelector(".ln-u-text-align-right")).click();

}

@Then("^I should see the cursor blinking$")
public void iShouldSeeTheCursorBlinking() {
    boolean searchbox=driver.findElement(By.cssSelector("#search")).isEnabled();
    Assert.assertEquals(searchbox,true);
    Assert.assertTrue(searchbox);
    driver.close();
}

@When("^I search with no data$")
public void i_search_with_no_data() throws Throwable {
    WebElement element= driver.findElement(By.id("search"));
    Thread.sleep(3000);
    element.sendKeys("  ");
    element.sendKeys(Keys.ENTER);
}
@Then("^I should see the desired error$")
public void i_should_see_the_desired_error() throws Throwable {
    String expected ="Sorry, no results for ''{0}''";
    String actual=driver.findElement(By.xpath("//h1[contains(text(),\"Sorry, no results for ''{0}''\")]")).getText();
    System.out.println(actual);
    Assert.assertThat(actual,containsString(expected));
    driver.close();
}

@When("^I search with color$")
public void i_search_with_color() throws Throwable {
	WebElement element= driver.findElement(By.id("search"));
    element.sendKeys("red");
    element.sendKeys(Keys.ENTER);
   
}

@Then("^I shuld able to see the color related products$")
public void i_shuld_able_to_see_the_color_related_products() throws Throwable {
	String Expected="SEARCH RESULTS FOR";
	String actual=driver.findElement(By.xpath("//span[contains(text(),'Search results for')]")).getText();
    Assert.assertThat(actual,containsString(Expected));
    Assert.assertEquals("Search results for: red | Tu clothing",driver.getTitle());
    driver.close();
}


@When("^I search with \"([^\"]*)\"$")
public void i_search_with(String arg1) throws Throwable {
	WebElement element=driver.findElement(By.id("search"));
			element.sendKeys(arg1);
			element.sendKeys(Keys.ENTER);
    
}

@Then("^I should see the \"([^\"]*)\" product$")
public void i_should_see_the_product(String arg1) throws Throwable {
	String Expected="SEARCH RESULTS FOR";
	String actual=driver.findElement(By.xpath("//span[contains(text(),'Search results for')]")).getText();
	 Assert.assertThat(actual,containsString(Expected));
	 driver.close();
   
}
@When("^I search for a \"([^\"]*)\"$")
public void i_search_for_a(String arg1) throws Throwable {
	WebElement element= driver.findElement(By.cssSelector("#search"));
    element.sendKeys(arg1);
    element.sendKeys(Keys.ENTER);
    
}

@Then("^I should see the desired \"([^\"]*)\"$")
public void i_should_see_the_desired(String arg1) throws Throwable {
	String actual= driver.getTitle();
    System.out.println(actual);
   String expected =arg1;
   Assert.assertThat(actual,containsString(expected));
   driver.close();
}

@When("^I enter invalid product name$")
public void i_enter_invalid_product_name() throws Throwable {
	WebElement element= driver.findElement(By.id("search"));
    element.sendKeys("hdjjdggdfjumper");
    element.sendKeys(Keys.ENTER);
    
}

@Then("^I should see error message for invalid product name$")
public void i_should_see_error_message_for_invalid_product_name() throws Throwable {
	String Expected="Sorry, no results for 'hdjjdggdfjumper'";
	String actual=driver.findElement(By.xpath("//h1[contains(text(),\"Sorry, no results for 'hdjjdggdfjumper'\")]")).getText();
    Assert.assertEquals(Expected,actual);
    driver.close();
}


@When("^I leave search text box blank$")
public void i_leave_search_text_box_blank() throws Throwable {
	WebElement element= driver.findElement(By.id("search"));
	element.sendKeys("");
	element.sendKeys(Keys.ENTER);
    
}

@Then("^I should see error message for blank product$")
public void i_should_see_error_message_for_blank_product() throws Throwable {
	String actual=driver.findElement(By.xpath("//span[contains(text(),'Please complete a product search')]")).getText();
	String Expected="Please complete a product search";
	Assert.assertEquals(Expected,actual);
	driver.close();
    
}

}

