package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement name = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		
		jk.executeScript("arguments[0].setAttribute('value','lakshmu34@gmail.com')", name);
		Object script = jk.executeScript("return arguments[0].getAttribute('value')", name);
		String name2 = (String) script;
		System.out.println(name2);
		
		jk.executeScript("arguments[0].setAttribute('value','894562354')", password);
		Object script2 = jk.executeScript("return  karguments[0].getAttribute('value')", password);
		String pass = (String) script2;
		
		System.out.println(pass);
		jk.executeScript("arguments[0].click()", login);

	}
}
