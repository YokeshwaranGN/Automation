package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> treadlocalDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return treadlocalDriver.get();
    }

    public static void initDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        treadlocalDriver.set(driver);
    }

    public static void quitDriver() {
        if (treadlocalDriver.get() != null) {
        	treadlocalDriver.get().quit();
            treadlocalDriver.remove();
        }
    }
}
