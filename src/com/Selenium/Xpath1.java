package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_help']"));
		element.click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@tabindex='0']"));
		firstname.sendKeys("Swathy");
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Raj");
		WebElement mobileno = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mobileno.sendKeys("1234569870");
		WebElement pwrd = driver.findElement(By.xpath("//input[@data-type='password']"));
		pwrd.sendKeys("Swathy@02");
		WebElement daydrop = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(daydrop);
		s.selectByValue("15");
		//Thread.sleep(2000);
		WebElement monthdrop = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1 = new Select(monthdrop);
		s1.selectByVisibleText("Aug");
		//Thread.sleep(2000);
		WebElement yeardrop = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(yeardrop);
		s2.selectByVisibleText("1991");
//		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		Thread.sleep(2000);
		WebElement accoutsubmit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		accoutsubmit.click();
		
		
	}

}
