package org.AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver"
		,"C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumAlert\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
	    WebDriver driver  = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    
	    //Simple Alert
	    
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
	    
	    WebElement login = driver.findElement(By.name("proceed"));
	    login.click();
	    
	    
	     org.openqa.selenium.Alert alert = driver.switchTo().alert();
	     alert.accept();

        WebElement name = driver.findElement(By.id("login1"));
	    name.sendKeys("greens");
		
	
		
	}

}
