package org.AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumDrop\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(" http://demo.guru99.com/test/drag_drop.html ");
	
	WebElement s = driver.findElement(By.xpath("//a[text() = ' BANK ']"));
	
	WebElement d = driver.findElement(By.xpath("//li[@class = 'placeholder']"));
	
	Actions actions = new Actions(driver);
	
	actions.dragAndDrop(s, d).perform();
	
	WebElement s1 = driver.findElement(By.xpath("//a[text() = ' 5000']"));
	
	WebElement d1 = driver.findElement(By.xpath("//li[@class = 'placeholder']"));
	 
	actions.dragAndDrop(s1, d1).perform();
	
	WebElement s2 = driver.findElement(By.xpath("//a[text() = ' SALES ']"));
	
	WebElement d2 = driver.findElement(By.xpath("//li[@class = 'placeholder']"));
	
	actions.dragAndDrop(s2, d2).perform(); 
	
	WebElement s3 = driver.findElement(By.xpath("//a[text() = ' 5000 ']"));
	
	WebElement d3 = driver.findElement(By.xpath("//li[@class = 'placeholder']"));
	
	actions.dragAndDrop(s3, d3).perform();
	
//	WebElement textname1 = driver.findElement(By.xpath("//a[text() = 'Perfect!']"));
//	textname.getText();
	
//	String attribute = textname.getAttribute("value");
//	System.out.println(attribute);


	}

}
