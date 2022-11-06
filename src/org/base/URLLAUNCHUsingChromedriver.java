package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class URLLAUNCHUsingChromedriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://www.greenstechnologys.com/");
		
		
		

	}

}
