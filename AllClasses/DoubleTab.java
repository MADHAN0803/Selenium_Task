package org.AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleTab {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
	,"C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleNavigationCmD\\Driver\\chromedriver_win32\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.facebook.com/");
     
     WebElement enter = driver.findElement(By.id("email"));
	 enter.sendKeys("greens");
	 
	 Actions actions = new Actions(driver);
	 
	 actions.doubleClick(enter).perform();
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	}
}