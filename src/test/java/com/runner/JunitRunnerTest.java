package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/features",
		glue = {"com.test.steps"},
		plugin = { "json:target/cucumber-reports/CucumberTestReport.json",
				"html:target/cucumber-reports/cucumber-html.html"
		},
				tags = "@Smoke",
				dryRun=true
				//dryRun=false (will run the test)
		)
		

public class JunitRunnerTest {

}
