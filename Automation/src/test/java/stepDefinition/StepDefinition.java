package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.Step;

public class StepDefinition {
	WebDriver driver ;
	Step stepfile = new Step(Hooks.driver);
	
	@Given("Launch Brower")
	public void launchBrower() {
		stepfile.launchBrowser();
	}
	@When("Enter the URL")
	public void enterTheURL() {
		stepfile.entertheURL();
	}
	@Then("Verify the product")
	public void verifyTheProduct() {
		stepfile.close();
	}
}
