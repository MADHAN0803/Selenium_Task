package org.AllClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Command {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleNavigationCmD\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Robot robot = new Robot();
		
		WebElement search = driver.findElement(By.xpath("//a[text() = 'Gmail']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(search).perform();
		
		actions.contextClick().perform();
		
		for (int i = 0; i < 3; i++) {
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			
			
			
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
