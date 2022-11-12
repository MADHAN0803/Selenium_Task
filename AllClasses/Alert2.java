
package org.AllClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumAlert\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//confirm Alert
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement clk = driver.findElement(By.xpath("//a[text() = 'Alert with OK & Cancel ']"));
		clk.click();
		
		WebElement clk1 = driver.findElement(By.xpath("//button[text() = 'click the button to display a confirm box ']"));
		clk1.click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		//Prompt Alert
		
		WebElement clk2 = driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']"));
		clk2.click();
		
		WebElement clk3 = driver.findElement(By.xpath("//button[text() = 'click the button to demonstrate the prompt box ']"));
		clk3.click();
		alert.sendKeys("MADHAN");
		
		
		Alert alert2 = driver.switchTo().alert();
		alert.accept();
		
        String attribute = clk3.getAttribute("value");
		System.out.println(attribute);
		
		driver.quit();
		
		
		
		
		
		
	}

}
