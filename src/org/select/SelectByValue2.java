package org.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		account.click();

		Thread.sleep(3000);
		WebElement value = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(value);
		s.selectByValue("3");

	}
}