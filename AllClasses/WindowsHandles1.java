package org.AllClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles1 {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumAB\\Driver\\chromedriver_win32\\chromedriver.exe");
   	
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.amazon.in/");
    
    WebElement textsearch = driver.findElement(By.id("twotabsearchtextbox"));
    textsearch.sendKeys("iphone",Keys.ENTER);
    
    
    WebElement lnkiphone = driver.findElement(By.xpath("//span[text() = 'Apple iPhone 12 (128GB) - Blue']"));
    lnkiphone.click();
    
    String parentwindowsid = driver.getWindowHandle();
    
    
    Set<String> allwindowsid = driver.getWindowHandles();
    
    
    List<String> li = new ArrayList();
    
    li.addAll(allwindowsid);
    
    String childwindowid = li.get(1);
    
    driver.switchTo().window(childwindowid);
    
    
    WebElement btncart = driver.findElement(By.id("add-to-cart-button"));
    btncart.click();
    
    driver.switchTo().window(parentwindowsid);
    
    WebElement click13 = driver.findElement(By.xpath("//span[text() = 'Apple iPhone 13 Pro (128GB) - Sierra Blue']"));
    click13.click();
    
    Set<String> windowHandles = driver.getWindowHandles();
    
    List<String> li1 = new ArrayList();
    
    li1.addAll(windowHandles);
    
    
    String newWindowId = li1.get(2);
    
    driver.switchTo().window(newWindowId);
    
    WebElement findElement = driver.findElement(By.id("add-to-cart-button"));
    findElement.click();
    
  
     }

    }
