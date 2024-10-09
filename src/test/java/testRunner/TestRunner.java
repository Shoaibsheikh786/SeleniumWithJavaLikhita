package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/login.feature",
		glue="stepDefination",
		tags=("@wip"),
		plugin= {"html:test-output/CucumberReports/cucumber.html"}
		)

public class TestRunner {
// details of feature file 
	// where is stepDefination(glue code)
	
}
