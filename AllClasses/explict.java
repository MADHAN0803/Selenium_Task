package org.AllClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explict{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumWaits\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement linkbtn = driver.findElement(By.xpath("//a[text() = 'Create New Account']"));
		linkbtn.click();
		
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   
	   WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
	   until.sendKeys("madhan");
	   
	   
	    
	    
	    
	   
	   
	   
	   
	   
		
		
		
				
		
		
		
	}
	
	
	 
}


	
	
	
	
 

