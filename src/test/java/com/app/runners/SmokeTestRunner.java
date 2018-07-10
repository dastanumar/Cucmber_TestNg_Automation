package com.app.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
		tags= "@smoke",
		features="src/test/resources/com.app.features/",
		glue="com.app.stepDefinitions",
		dryRun=false
		)

public class SmokeTestRunner extends AbstractTestNGCucumberTests{

}
