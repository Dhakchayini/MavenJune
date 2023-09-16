package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupJavascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
	JavascriptExecutor js =(JavascriptExecutor) driver;// narrow typecasting syntax
//	WebElement text = driver.findElement(By.xpath("//p[@data-test='topDestinationWrapper_heading']"));
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", text);
//		Thread.sleep(2000);
//		
		js.executeScript("window.scrollBy(0,2000);");
		Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-1000);");
	Thread.sleep(1000);
	js.executeScript("alert('Welcome to mytrip');");
	js.executeScript("returndocument.URL;");
		
			
		
		
	}

}