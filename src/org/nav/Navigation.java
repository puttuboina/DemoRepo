package org.nav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().forward();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();

	}

}
