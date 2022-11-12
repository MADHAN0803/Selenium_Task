package org.AllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dragdown1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumDragDown1\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dndcars = driver.findElement(By.id("cars"));
		
		Select select = new Select(dndcars);
		
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
		
		for (int i = 0; i<4; i=i+2) {
			select.selectByIndex(i);
			
		}
		
	   List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	   
	   for (WebElement eachselected : allSelectedOptions) {
		   
		   System.out.println(eachselected.getText());
		   
		   }
	   
	   
	   List<WebElement> alloptions = select.getOptions();
	   
	   for (WebElement eachoptions : alloptions) {
		   
		   String text = eachoptions.getText();
		   
		   select.selectByVisibleText(text);


			}
	   
	   
	   WebElement firstSelectedOption = select.getFirstSelectedOption();
	   System.out.println(firstSelectedOption.getText());
	   
	   select.deselectByIndex(2);
	   
	   select.deselectAll();
	 
	   
	  	}
		
	
	
	
	
	}


