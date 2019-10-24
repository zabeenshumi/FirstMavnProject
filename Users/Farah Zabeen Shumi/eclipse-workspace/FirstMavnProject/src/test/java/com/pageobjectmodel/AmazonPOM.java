package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPOM{
	WebDriver driver;
public 	AmazonPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}

@FindBy(xpath="//input[@id='email']")
private WebElement email;
public WebElement getEmail() {
	return email;
}

@FindBy(xpath="//input[@id='pass']")
private WebElement Password;
public WebElement getPassword() {
	return Password;
}
@FindBy(xpath="//input[@type='submit']")
private WebElement Login;
public WebElement getLogin() {
	return Login;
}


}



