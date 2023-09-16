package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class path {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\purus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--remote-allow-origins=*");

		
		WebDriver driver = new ChromeDriver(opt);
		
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("ddjjdjhjk");

		driver.findElement(By.name("pass")).sendKeys("sssssskk");

		System.out.println(driver.findElement(By.cssSelector("h2._8eso")).getText());

		driver.findElement(By.name("login")).click();
	
		driver.findElement(By.linkText("Forgotten password?")).click();

		driver.findElement(By.partialLinkText("Sign up")).click();

		driver.close();
	}

}
