package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Feature/amazon.feature",
		glue = "stepDefinition",
//		plugin = {"pretty", "html:target/cucumber-report.html"},
		monochrome = true
//		dryRun = false
		)
public class TestRunner extends AbstractTestNGCucumberTests {
}