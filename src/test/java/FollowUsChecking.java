import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FollowUsChecking {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#consent_prompt_submit")).click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href^=\"https://www.instagram.com/tuclothing\"]")).click();
        driver.findElement(By.cssSelector(".mt3GC .bIiDR  ")).click();
        driver.findElement(By.cssSelector(".tdiEy .y3zKF")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("1234433");
        driver.findElement(By.cssSelector(".y3zKF ._4EzTm")).click();
	}

}
