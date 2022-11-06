package org.window;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone X");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement phone = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		act.contextClick(phone).perform();
		phone.click();

		WebElement price = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]"));
		String s = price.getText();
		System.out.println(s);

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String x : windowHandles) {
			if (!windowHandle.equals(x)) {
				driver.switchTo().window(x);
			}
		}

		WebElement phone2 = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		phone2.click();

		WebElement cost = driver.findElement(By.xpath("//span[text()='$1,569.99']"));
		String text = cost.getText();
		System.out.println(text);

		String windowHandle2 = driver.getWindowHandle();
		System.out.println(windowHandle2);

		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
		
		List<WebElement> li = new ArrayList<>();
		li.addAll(li);
       // driver.switchTo().window();
       
		WebElement price2 = driver.findElement(By.xpath(""));
		String text2 = price2.getText();
		System.out.println(text2);

	}
}
