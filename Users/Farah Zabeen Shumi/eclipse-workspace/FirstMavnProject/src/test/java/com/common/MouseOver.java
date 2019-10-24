package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
	  
	System.setProperty("driver.chrome.driver", "./Browser/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https:www.ebay.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	Actions ac= new Actions(driver);
     WebElement a= driver.findElement(By.xpath(""));
     WebElement a2= driver.findElement(By.xpath(""));
     ac.moveToElement(a).moveToElement(a2).click().build().perform();
     
	}

}
