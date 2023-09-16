package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void  NavigationTask() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.nasa.gov/");
		
		WebElement search = driver.findElement(By.xpath("//input[@aria-hidden='false']"));
		search.sendKeys("space");
		//driver.findElement(By.xpath(null))
		
		
		
	}

	public static void main(String[] args) {
		NavigationTask();
	}
}
