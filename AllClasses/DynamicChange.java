package org.AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicChange {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumDynamic\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
        
        
		
		WebElement data = driver.findElement(By.xpath("(//a[text() = 'Reliance']//following::td[2])[1]"));
		System.out.println(data.getText());
		
		
		
		WebElement rows = driver.findElement(By.xpath("(//a[text() = 'NIFTY BANK']//preceding::tr[2])[1]"));
        System.out.println(rows.getText());	
		
		
	}

}
