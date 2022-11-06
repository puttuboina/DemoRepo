package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple2 {
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

		WebElement first = s.getFirstSelectedOption();
		String y = first.getText();
		System.out.println(y);

		boolean b = s.isMultiple();
		System.out.println(b);

		List<WebElement> li = s.getAllSelectedOptions();
		for (int i = 0; i < li.size(); i++) {
			WebElement x = li.get(i);
			String s2 = x.getText();
			System.out.println(s2);

		}
	}

}
