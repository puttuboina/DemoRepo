package org.wettable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WetTable2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		List<WebElement> li = driver.findElements(By.tagName("tr"));
		int size = li.size();
		System.out.println(size);

		List<WebElement> li2 = driver.findElements(By.id("td"));
		int size2 = li2.size();
		System.out.println(size2);
	}

}
