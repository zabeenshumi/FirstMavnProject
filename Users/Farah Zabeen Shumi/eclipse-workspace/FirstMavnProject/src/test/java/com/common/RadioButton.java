package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		   
 WebElement custom=driver.findElement(By.xpath("//input[@id='u_0_9']"));
		 custom.click();
  boolean x= custom.isEnabled();
  System.out.println(x);
	}
}
