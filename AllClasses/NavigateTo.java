package org.AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleNavigationCmD\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.id("email"));
		text.sendKeys("greens");
		
		
		WebElement link = driver.findElement(By.xpath("//a[text() = 'Forgotten password?']"));
		link.click();
		
		WebElement nmbr = driver.findElement(By.id("identify_email"));
		nmbr.sendKeys("23456787654");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
	}
	
	
	
	

}
