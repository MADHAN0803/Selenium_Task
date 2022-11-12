package org.AllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumExercise1\\Driver\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	
	List<WebElement> tableheader = driver.findElements(By.tagName("td"));
	
	
	for (WebElement eachHeader : tableheader) {
		
		System.out.println(eachHeader.getText());
		
	}
	
	 System.out.println("====================");
	
	List<WebElement> Allrows = driver.findElements(By.tagName("tr"));
	
	
	
	
	WebElement eachrows = Allrows.get(1);
	System.out.println(eachrows.getText());
	
	System.out.println("------------------------");
	
	
	
	
	for (WebElement eachRows : Allrows) {
		
		System.out.println(eachRows.getText());
		
		
	}
	
	
	
	
	
	}

}
