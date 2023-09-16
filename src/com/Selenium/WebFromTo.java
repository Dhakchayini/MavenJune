package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFromTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		String title= driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		
		
	}

}
