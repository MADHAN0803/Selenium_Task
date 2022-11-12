package org.AllClasses;

public class Actions {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\Selenium\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.flipkart.com");

		WebElement linkorders = driver.findElement(By.xpath("//div[text() = 'Home']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(linkorders).perform();

		WebElement lnkbath = driver.findElement(By.xpath("//a[text() = 'Bath Towels']"));

		actions.moveToElement(lnkbath).perform();

	}

}
