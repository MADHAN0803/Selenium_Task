package org.AllClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\ScreenShot1\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.amazon.in/");
	   
	   WebElement click = driver.findElement(By.id("twotabsearchtextbox"));
	   click.sendKeys("iphone");
	   click.click();
	   WebElement clck = driver.findElement(By.id("nav-search-submit-button"));
	   clck.click();
	  
	   
	   JavascriptExecutor executor = (JavascriptExecutor) driver;
	   
	   WebElement  conditions = driver.findElement(By.xpath("(//img[@class = 's-image'])[18]"));
	   
	   //to scrolldown
	   
	   executor.executeScript("arguments[0].scrollIntoView(true)", conditions);
	   
	   TakesScreenshot screenshot = (TakesScreenshot) driver;
	   
	   //Temp location
	   File from = screenshot.getScreenshotAs(OutputType.FILE);
	   
	   //Permanent Location
	   File to = new File("C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\ScreenShot1\\ss\\amazon.jpeg");
	   
	   FileHandler.copy(from, to);
	   
	  WebElement condition1 = driver.findElement(By.xpath("(//img[@class = 's-image'])[16]"));
	  
	  //ToScrollUp
	  executor.executeScript("arguments[0].scrollIntoView(false)", condition1);
	  
	  File from1 = screenshot.getScreenshotAs(OutputType.FILE);
	  
	  File to1 = new File("C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\ScreenShot1\\ss\\ama.jpeg");
	  
	  FileHandler.copy(from1, to1);
	   
	  driver.quit();
	  
	   
	   
	  }
	
	
}
