package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextandContains {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement Text = driver.findElement(
				By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
		String text1 = Text.getText();
		System.out.println(text1);
		
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),  'Learn')]"));
		String txt1=txt.getText();
		System.out.println(txt1);
	}
}
