package org.AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumMouse\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement linkcourse = driver.findElement(By.xpath("//a[text() = 'COURSES']"));
	
	Actions actions = new Actions(driver);
	
	actions.moveToElement(linkcourse).perform();
	
	WebElement linkoracale = driver.findElement(By.xpath("//span[text() = 'Oracle Training']"));
	actions.moveToElement(linkoracale).perform();
	
	WebElement linksql = driver.findElement(By.xpath("//span[text() = 'SQL Certification']"));
	linksql.click();
	
	}
	
	

}
