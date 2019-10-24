package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
	features ="Cucumber",
	glue="com.stepdef",
	tags="@log"
		
	)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}

	

