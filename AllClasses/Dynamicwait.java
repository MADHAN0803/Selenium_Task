package org.AllClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwait {
	
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANTHOSH KUMAR\\Downloads\\chromedriver_win32 2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/"); 
		
		WebElement clicktext = driver.findElement(By.xpath("//a[text() = 'Create New Account']"));
		clicktext.click();

		WebElement newname = driver.findElement(By.name("firstname"));
		newname.sendKeys("greens");
		
		
		
	}
	
	
	

}
