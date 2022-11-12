package org.AllClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotKeysFun {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumLocatorFB\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.facebook.com/ ");
	   
       Robot robot = new Robot();
       
       robot.keyPress(KeyEvent.VK_G);
       robot.keyRelease(KeyEvent.VK_G);
       
       
       robot.keyPress(KeyEvent.VK_R);
       robot.keyRelease(KeyEvent.VK_R);
       
       robot.keyPress(KeyEvent.VK_E);
       robot.keyRelease(KeyEvent.VK_E);
       
       robot.keyPress(KeyEvent.VK_E);
       robot.keyRelease(KeyEvent.VK_E);
       
       robot.keyPress(KeyEvent.VK_N);
       robot.keyRelease(KeyEvent.VK_N);
       
       robot.keyPress(KeyEvent.VK_S);
       robot.keyRelease(KeyEvent.VK_S);
      
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_A);
       robot.keyRelease(KeyEvent.VK_A);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_X);
       robot.keyRelease(KeyEvent.VK_X);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       
    
       robot.keyPress(KeyEvent.VK_TAB);
       robot.keyRelease(KeyEvent.VK_TAB);
       
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_CONTROL);
	}
} 
       
       
       
       
       
       
       
       
       
   
       
	    
	   
	   
	
	
	
	

	
		
	

 
