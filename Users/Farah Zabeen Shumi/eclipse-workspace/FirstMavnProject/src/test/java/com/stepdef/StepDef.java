package com.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.AmazonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
  AmazonPOM a;
@Given("^going home page$")
public void going_home_page() throws Throwable {
	 getDriver();
   a=PageFactory.initElements(driver, AmazonPOM.class);
}

@When("^I am able to put email$")
public void i_am_able_to_put_email() throws Throwable {
   a.getEmail().sendKeys("fzabeens07@yahoo.com");
   
}

@When("^I able to put password$")
public void i_able_to_put_password() throws Throwable {
    a.getPassword().sendKeys("shukurAllah7");
}

@When("^user able to click login$")
public void user_able_to_click_login() throws Throwable {
   a.getLogin().click(); 
}

@Then("^login should be successful$")
public void login_should_be_successful() throws Throwable {
   Assert.assertEquals(driver.getTitle(), "Facebook"); 
}

}
