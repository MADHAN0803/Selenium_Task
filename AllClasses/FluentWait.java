package org.AllClasses;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\FluentWait\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.xpath("//a[text() = 'Create New Account']"));
		text.click();
		
		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).
				pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		
		
		WebElement until = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.name("firstname"));
				
						
			}

		
		});
		
		until.sendKeys("Greens");
		
		
		
		
		
		
	}

}
