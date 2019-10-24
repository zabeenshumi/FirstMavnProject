package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Farah Zabeen Shumi\\eclipse-workspace\\"
				+ "FirstMavnProject\\Browser\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("https://www.expedia.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();
	driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']")).click();
	List<WebElement>list=driver.findElements(By.xpath("//input[@id='hotel-checkin-hp-hotel']"));
	
	driver.findElement(By.xpath("(//div[@class='datepicker-cal-month'])[1]")).click();
	driver.findElement(By.xpath("//button[@data-month='9' and @data-day='29']")).click();

	driver.findElement(By.xpath("//input[@id='hotel-checkout-hp-hotel']")).click();
	driver.findElement(By.xpath("//button[@data-month='10' and @data-day='7']")).click();
	driver.findElement(By.xpath("(//button[@class='btn-primary btn-action  gcw-submit'])[1]")).click();
	
	driver.findElement(By.xpath("//input[@class='clear-btn-input gcw-storeable text gcw-destination gcw-required ']")).sendKeys("Dhaka, Bangladesh");
	
	
	
	
		
		
		
		
		
	}

}
