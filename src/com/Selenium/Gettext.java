package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\Selenium1\\Chrome\\Chromedriverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement sel = driver.findElement(By.xpath("//select[@name='cars']"));
		Select a = new Select(sel);
		a.selectByVisibleText("Volvo");
		a.selectByVisibleText("Saab");
		a.selectByVisibleText("Opel");
		List<WebElement> a1 = a.getOptions();
		System.err.println("Options in the dropdown ");
		for(int i =0; i<a1.size();i++)
		{
			System.out.println(a1.get(i).getText());
		}
		System.err.println("Selected option List Out");
		List<WebElement> a2 = a.getAllSelectedOptions();
		for(WebElement a3:a2)
		{
			System.out.println(a3.getText());
		}
		WebElement sel1 = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select b = new Select(sel1);
		b.selectByVisibleText("Yellow");
		WebElement b1 = b.getFirstSelectedOption();
		System.err.println("First Selected option List");
		System.out.println(b1.getText());
		}
}
