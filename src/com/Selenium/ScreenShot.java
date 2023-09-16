package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot a = (TakesScreenshot)driver;
		File screenshotAs = a.getScreenshotAs(OutputType.FILE);
		File mem = new File("C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Screenshot\\scool.jpeg");
		//FileHandler.copy(screenshotAs, mem);
		FileUtils.copyFile(screenshotAs, mem);
		
	
	}
}
