package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bookingTask {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\purus\\eclipse-workspace\\WindowsHandling\\Chrome");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("swathyraj");
		WebElement pswd = driver.findElement(By.xpath("//input[@id='password']"));
		pswd.sendKeys("swathy@1");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select a = new Select(location);
		a.selectByVisibleText("London");
		//Thread.sleep(2000);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select b = new Select(hotel);
		b.selectByValue("Hotel Hervey");
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select c = new Select(room);
		c.selectByIndex(1);
	//	Thread.sleep(2000);
		WebElement nor = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select d = new Select(nor);
		d.selectByVisibleText("4 - Four");
		WebElement adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select e = new Select(adroom);
		e.selectByVisibleText("2 - Two");
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select f = new Select(childroom);
		f.selectByValue("4");
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		search.click();
		//Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		radio.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));;
		fname.sendKeys("Swathy");
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));;
		lname.sendKeys("raj");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));;
		address.sendKeys("Thiruvallur");
		WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));;
		credit.sendKeys("1234567890");
		WebElement creditcard = driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select g = new Select(creditcard);
		g.selectByIndex(1);
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select h = new Select(month);
		h.selectByVisibleText("May");
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select i = new Select(year);
		i.selectByVisibleText("2017");
		driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("345");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	

}
