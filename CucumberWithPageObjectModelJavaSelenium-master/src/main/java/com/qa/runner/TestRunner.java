package com.qa.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\main\\java\\com\\qa\\features\\freecrm.feature"
	,glue = {"com/qa/stepdefinitions"}
	,format = {"pretty","junit:target/junit_output/Cucumber.xml","html:target/cucumber-reports"}
	)

	public class TestRunner {

}

