package org.AllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumDragDown\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement dndskills = driver.findElement(By.id("Skills"));
		
		Select select = new Select(dndskills);
   		
		//using index
		select.selectByIndex(10);
		
		Thread.sleep(2000);
		
		//using visible text
		select.selectByVisibleText("Android");
		
		Thread.sleep(2000);
		
		
		//using value
		select.selectByValue("Certifications");
		
		List<WebElement> options = select.getOptions();
		
		//to get the count
				int size = options.size();
				System.out.println(size);
				
		
		for (int i = 0; i< options.size(); i++) {
			 
			WebElement eachoptions = options.get(i);
			String text = eachoptions.getText();
			System.out.println(text);
			
			
		}
		
		
		System.out.println("=============================");
		
		
	   for (WebElement webElement : options) {
		   
		   String text = webElement.getText();
		   System.out.println(text);
		  
		
	}
	   
	   }

}
