package org.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SizeoftheSelect {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		account.click();

		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);

		for (int i = 0; i < options.size(); i++) {
			WebElement li = options.get(i);
			String s1 = li.getText();
			System.out.println(s1);

		}
		System.out.println("print all the options which available in the drop down");
		for (WebElement y : options) {
			String attribute = y.getAttribute("value");
			System.out.println(attribute);
		}
	}
}
