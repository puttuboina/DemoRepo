package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterMailandPasswordUsingID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("luckypari");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("luckypari");

		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

}
