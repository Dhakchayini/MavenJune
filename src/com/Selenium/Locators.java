package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		

		
		
		
	}
	

}
