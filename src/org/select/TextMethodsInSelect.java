package org.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextMethodsInSelect {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");

		WebElement multiple = driver.findElement(By.id("fruits"));
		Select s = new Select(multiple);
		s.selectByIndex(2);
		s.selectByValue("banana");
		s.selectByVisibleText("Grape");

		boolean mutiple1 = s.isMultiple();
		System.out.println(mutiple1);

	}

}
