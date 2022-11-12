package org.AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUP {
	
	public static void main(String[] args) throws InterruptedException {
		
   System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumScroll\\Driver\\chromedriver_win32\\chromedriver.exe");
		
   WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   
   driver.get("https://www.amazon.in/");
   
		   JavascriptExecutor executor = (JavascriptExecutor) driver;
		   
		   WebElement conditions = driver.findElement(By.xpath("//a[text() ='Conditions of Use & Sale']"));
		   
		   //To Scroll Down
		   executor.executeScript("arguments[0].scrollIntoView(true)", conditions);
		   
		  WebElement kitchen = driver.findElement(By.xpath("//a[text() = 'Home & Kitchen']"));
		  
		  Thread.sleep(5000);
		  
		  //To SCrollup
		  executor.executeScript("arguments[0].scrollIntoView(false)", kitchen);
		  
		   
		   
		   
		    
		   
   
		
	}

}
