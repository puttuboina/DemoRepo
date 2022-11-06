package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("document.getElementById('email').style.border='5px red solid';");
		jk.executeScript("document.getElementById('pass').style.border='5px pink solid';");
		jk.executeScript("document.getElementById('email').style.background='yellow';");
		jk.executeScript(
				"document.getElementById('email').setAttribute('style','border:5px pink solid;background:brown;color:black');");

	}

}
