package org.AllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
	    
				"C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumWebTable\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
        driver.get("http://www.leafground.com/pages/table.html");
        
        
        List<WebElement> tableheader = driver.findElements(By.tagName("th"));
        
        
        
        
        for (WebElement eachHeader : tableheader) {
        	System.out.println(eachHeader.getText());
			
		}
        
        System.out.println("=================");
		
        
        List<WebElement> allRows = driver.findElements(By.tagName("tr"));
        
        WebElement secondrow = allRows.get(1);
        System.out.println(secondrow.getText());
        
        System.out.println("------------------");
        
        for (WebElement eachrows : allRows) {
        	
        	System.out.println(eachrows.getText());
			
		}
        
        System.out.println("=======================");
       
        
        
        List<WebElement> alldatas = driver.findElements(By.tagName("td"));
        
        
        for (WebElement eachdatas : alldatas) {
        	
        	System.out.println(eachdatas.getText());
			
		}
        
        
        driver.quit();
        
        
        
		
	}
	
	
	
	

}
