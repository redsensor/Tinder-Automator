package appium.test.android.util;

import appium.test.android.pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static appium.test.android.util.Helpers.driver; //or extend helpers

public class AppiumTest extends Helpers {

    static {
        // Disable annoying cookie warnings.
        // WARNING: Invalid cookie header
        LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
    }

    /** Page object references. Allows using 'home' instead of 'HomePage' **/
    protected HomePage home;

    /** wait wraps Helpers.wait **/
    public static WebElement wait(By locator) {
        return Helpers.wait(locator);
    }

    /** Keep the same date prefix to identify job sets. **/
    private static Date date = new Date();

    /** Run before each tests **/
    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("name", "Tinder" + date);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("noReset", true);

        URL serverAddress;
            serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(serverAddress, capabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Helpers.init(driver, serverAddress);
    }

    /** Run after each tests **/
    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }
}