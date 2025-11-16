package step;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import testObject.TestObject;

public class Step extends TestObject{
	WebDriver driver;
	int number ;
	String productNameInLandingPage ;
	String ProductPriceInLandingPage ;
	String productNameInCartPage ;
	String ProductPriceInCartPage ;

	public Step(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void launchBrowser() {

		driver.get("https://www.amazon.in/");
	}
	public void searchForProduct(String string) {
		try {
			visibility(continueShopping);
			continueShopping.click();
		}catch(Exception e) {

		}
		visibility(serachBox);
		serachBox.sendKeys(string,Keys.ENTER);
//		serachBoxGo.click();
	}
	public void selectProductFromSearchResults() {
		visibility(addToCart.get(2));
		int listProductName = addToCart.size();

		Random rand = new Random();
		number = rand.nextInt(listProductName); 

	}
	public void captureProductDetails() {
		productNameInLandingPage = productName.get(number).getText().toString().trim();
		ProductPriceInLandingPage = productPrice.get(number).getText().toString().trim();
	}
	public void addProductToCart() {
		visibility(addToCart.get(number));
		addToCart.get(number).click();

	}
	public void verifyProductInCart() {
		visibility(cart);
		cart.click();
		visibility(productPriceInCartPage);
		productNameInCartPage = productNameInTheCartPage.getText().toString().trim();
		ProductPriceInCartPage = productPriceInCartPage.getText().toString().trim().replace("₹", "").split("\\.")[0];
		Assert.assertEquals(productNameInCartPage, productNameInLandingPage);
		Assert.assertEquals(ProductPriceInCartPage, ProductPriceInLandingPage);
	}

	public void serch() {
		visibility(search);
		search.sendKeys("India",Keys.ENTER);
	}
	
	public void launch() {
		driver.get("https://www.google.com/");
	}
}
