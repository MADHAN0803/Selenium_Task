package org.work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
	    "C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumFrames\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
	
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("http://www.leafground.com/pages/frame.html");
	   
	   List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
	   int size = totalframes.size();
	   System.out.println(size);
	   
	   driver.switchTo().frame(0);
	   
       WebElement btnclick = driver.findElement(By.id("Click"));
       btnclick.click();
       
       //Parent DOM
       
       driver.switchTo().defaultContent();
       
       WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
       
       driver.switchTo().frame(frame2);
       
       driver.switchTo().frame("frame2");
       
       WebElement clk1 = driver.findElement(By.id("Click1"));
       clk1.click();
       
       
      }
	
	
}
