package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("singleframe");
		WebElement findElement = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Eng");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tamil")	;	
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
	
	
	}

}
