package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	    @Before
	    public void setUp() {
	        System.out.println("🚀 Launching browser...");
	        DriverFactory.initDriver();
	    }

	    @After
	    public void tearDown() {
	    	 DriverFactory.quitDriver();
	}
}
