package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty", "html:target/cucumber",
				 "json:target/cucumber.json"},
		tags= "@dastan",
		features= {"src/test/resources/com.app.features/","src/test/resources/hrapp.features"},
		glue="com.app.stepDefinitions",
		dryRun=false
		)

public class CukesRunner extends AbstractTestNGCucumberTests{



}
