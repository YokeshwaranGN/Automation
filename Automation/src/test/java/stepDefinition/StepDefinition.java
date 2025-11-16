package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.Step;

public class StepDefinition {
	WebDriver driver ;
//	Step stepfile = new Step(Hooks.driver);
	Step stepfile = new Step(DriverFactory.getDriver());

	@Given("the browser is launched")
	public void launchBrowser() {
		stepfile.launchBrowser();
	}
	@Given("the user searches for {string}")
	public void searchForProduct(String string) {
		stepfile.searchForProduct(string);
	}
	@Given("the user selects the product from the search results")
	public void selectProductFromSearchResults() {
		stepfile.selectProductFromSearchResults();
	}
	@Given("the product name and price are recorded")
	public void captureProductDetails() {
		stepfile.captureProductDetails();
	}
	@When("the user adds the product to the cart")
	public void addProductToCart() {
		stepfile.addProductToCart();
	}
	@Then("the product added to the cart should match the recorded details")
	public void verifyProductInCart() {
		stepfile.verifyProductInCart();
	}
	
	@Given("launch")
	public void launch() {
		stepfile.launch();
	}
	@When("serch")
	public void serch() {
		stepfile.serch();
	}
}
