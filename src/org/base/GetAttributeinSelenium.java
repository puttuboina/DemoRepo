package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeinSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://adactinhotelapp.com/");
		
		WebElement name = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		name.sendKeys("luckypari");
		String attribute = name.getAttribute("value");
		System.out.println(attribute);

		WebElement name2 = driver.findElement(By.xpath("//input[@id='password')]"));
		name.sendKeys("luckypari");
		String attribute2 = name2.getAttribute("value");
		System.out.println(attribute2);

	}
}
