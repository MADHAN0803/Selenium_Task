package org.AllClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumEve\\Driver\\chromedriver.exe");
		//To launch the browser
	  WebDriver driver = new ChromeDriver();
	  
	  //To Enter URL
	  
	  driver.get("https://www.facebook.com/" );
	  
	  //To get title
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  // To get current URL
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	  
	   
	  
	  
		
	}

}
