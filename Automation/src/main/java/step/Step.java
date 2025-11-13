package step;

import org.openqa.selenium.WebDriver;

import testObject.TestObject;

public class Step {
	WebDriver driver ;
	TestObject testObject;
	
	public Step(WebDriver driver) {
		this.driver=driver;
	}
	public void launchBrowser() {
		testObject  = new TestObject(driver);
	}

	public void entertheURL(){
		driver.get("https://www.youtube.com/watch?v=CyogPyN7U4M");

		testObject.name.isDisplayed();
	}

	public void close() {
//		driver.close();
	}
}
