package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");

		WebElement draganddrop = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		Actions act = new Actions(driver);
		WebElement draganddrop2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		act.dragAndDrop(draganddrop, draganddrop2).perform();

	}

}
