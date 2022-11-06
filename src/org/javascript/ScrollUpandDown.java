package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpandDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");

		WebElement scrolldown = driver.findElement(By.xpath("(//span[@class='red_text'])[1]"));
		WebElement scrollup = driver.findElement(By.xpath("//a[@class='activeLink']"));
		JavascriptExecutor jk = (JavascriptExecutor) driver;

		jk.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		Thread.sleep(3000);
		jk.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		
		
	}

}
