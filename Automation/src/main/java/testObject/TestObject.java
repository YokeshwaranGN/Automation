package testObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import master.BasePage;

public class TestObject extends BasePage {

	WebDriver driver ;

	public TestObject(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@alt='Continue shopping']")
	public WebElement continueShopping;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement serachBox;

	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public WebElement serachBoxGo;

	@FindBy(xpath="//h2[contains(@class,'a-spacing-none a-color-base a-text-normal')]//span")
	public List<WebElement> productName;

	@FindBy(xpath="//span[@class='a-price']//span[@class='a-price-whole']")
	public List<WebElement> productPrice;

	@FindBy(xpath="//button[@aria-label='Add to cart']")
	public List<WebElement> addToCart;

	@FindBy(xpath="//a[contains(@aria-label,'item in cart')]")
	public WebElement cart;

	@FindBy(xpath="//span[(@class='a-truncate-cut') or (@class='a-truncate-full')]")
	public WebElement productNameInTheCartPage;

	@FindBy(xpath="//div[@class='sc-item-price-block']//span[@aria-hidden='true']")
	public WebElement productPriceInCartPage;


	@FindBy(xpath="//textarea[@name='q']")
	public WebElement search;

}
