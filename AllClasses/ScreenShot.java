package org.AllClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\ScreenShot\\Drive\\chromedriver_win32 (1)\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	  driver.get("https://www.amazon.in/");
	  
	  //to use casting
	  TakesScreenshot s = (TakesScreenshot) driver;
	  
	  //Temp Location
	  File from = s.getScreenshotAs(OutputType.FILE);
	  
	  //permanent Location
	  
	  File to = new File("C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\ScreenShot\\ss\\amazon.jpeg");
	  
	  FileHandler.copy(from, to);
	  
	  driver.quit();
	}

}
