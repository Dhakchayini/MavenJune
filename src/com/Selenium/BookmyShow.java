package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookmyShow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='Varisu']")).click();
//		
		driver.findElement(
				By.xpath("(//span[@style='font-weight: 500; font-size: 16px; color: rgb(255, 255, 255);'])[1]"))
				.click();

		driver.findElement(By.xpath("//a[text()='AGS Cinemas: Villivakkam']")).click();

		driver.findElement(By.xpath("(//div[@class='date-month'])[3]")).click();

		driver.findElement(By.xpath("(//div[@class='__text'])[11]")).click();

		driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();

//		driver.findElement(By.xpath("//li[@id='pop_4']")).click();
//		
		driver.findElement(By.xpath("//div[@class='bar-btn _primary _full-width _centered']")).click();

		driver.findElement(By.xpath("//div[@id='A_7_06']")).click();

		driver.findElement(By.xpath("//div[@id='A_7_07']")).click();

		driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]")).click();

	}

}
