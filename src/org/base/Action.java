package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homedepot.com/");

		WebElement mouse = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).perform();
		String txt = mouse.getText();
		System.out.println(txt);

		WebElement mouse2 = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		act.moveToElement(mouse2).perform();
		String txt2 = mouse2.getText();
		System.out.println(txt2);

		WebElement mouse3 = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		act.moveToElement(mouse3).perform();
		String txt3 = mouse3.getText();
		System.out.println(txt3);

		WebElement mouse4 = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		mouse4.click();
	}
}
