package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightandContextClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement right = driver.findElement(By.id("email"));
		right.sendKeys("lakshmi@gmail.com");
		Actions act = new Actions(driver);
		act.contextClick().perform();

		WebElement left = driver.findElement(By.id("pass"));
		left.sendKeys("2357567648");
		Thread.sleep(3000);
		act.doubleClick(left).perform();

	}

}
