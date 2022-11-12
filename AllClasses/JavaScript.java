 package org.AllClasses;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\SeleniumJavaScript\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/ ");
		
		
		//Type casting
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		WebElement textName = driver.findElement(By.id("email"));
		
		WebElement textpass = driver.findElement(By.id("pass"));
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		
		executor.executeScript("arguments[0].setAttribute('value','Greens')", textName,textpass);
		
		Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')",textName);
		System.out.println(executeScript);
		
		executor.executeScript("arguments[0].click()",btnlogin);
		
	
	}

}
