package org.wettable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WetTable1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		List<WebElement> tr = driver.findElements(By.tagName("td"));
		int size = tr.size();
		System.out.println(size);

		List<WebElement> td = driver.findElements(By.tagName("tr"));
		int size2 = td.size();
		System.out.println(size2);

	}
}
