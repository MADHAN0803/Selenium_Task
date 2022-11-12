package org.AllClasses;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumWindows\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchbtn = driver.findElement(By.id("twotabsearchtextbox"));
		searchbtn.sendKeys("iphone",Keys.ENTER);
		
		String parentwindowid = driver.getWindowHandle();
		System.out.println(parentwindowid);
		
		WebElement linkiphone = driver.findElement(By.xpath("//span[text() = 'Apple iPhone 12 (128GB) - Blue']"));
		linkiphone.click();
		
		
		Set<String> allwindowsid = driver.getWindowHandles();
		
		System.out.println(allwindowsid);
		
		for (String eachwindowsid : allwindowsid) {
			
			if (!parentwindowid.equals(eachwindowsid)) {
				
				driver.switchTo().window(eachwindowsid);
				
			}
		
			
		}
		
		WebElement btncart = driver.findElement(By.id("add-to-cart-button"));
		btncart.click();
	}

}
