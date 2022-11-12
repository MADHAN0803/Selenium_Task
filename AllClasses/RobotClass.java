package org.AllClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumRobot\\Driver\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/ ");
	
    
       
       
       
       
       
       
       
	
	}

}



