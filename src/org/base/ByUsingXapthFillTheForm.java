package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingXapthFillTheForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("Lakshmi");

		WebElement Lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Lname.sendKeys("Prasanna");

	}

}
